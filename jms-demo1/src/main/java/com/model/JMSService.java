package com.model;

import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
import javax.jms.Queue;
import javax.jms.TextMessage;

@Stateful
public class JMSService 
{
	@Resource(mappedName = "java:/jms/queue/DLQ")
	Queue jmsQ;
	
	@Inject
	JMSContext context;
	
	public void sendMessage(String msg)
	{
		try 
		{
			JMSProducer producer = context.createProducer();
			TextMessage message = context.createTextMessage(msg);
			producer.send(jmsQ, message);
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String receiveMessage()
	{
		String msg = "";
		try
		{
			JMSConsumer consumer = context.createConsumer(jmsQ);
			TextMessage message = (TextMessage) consumer.receiveNoWait();
			if(message != null)
				msg = message.getBody(String.class);
			consumer.close();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return msg;
	}
}
