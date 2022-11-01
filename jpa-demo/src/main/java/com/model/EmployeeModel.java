package com.model;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Employee;

@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class EmployeeModel implements EmployeeRemote
{

	@Override
	public String insertData(Employee E) throws Exception 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(E);
		em.getTransaction().commit();
		em.close();
		emf.close();
		return "Record Inserted";
	}

}
