<%!
int a=10,b=20; //variables
String name="klu";
int add(int x,int y)
{
	return x+y;
}
%>

<%
System.out.println(add(a,b));
out.println(add(a,b));
%>

<font size="+2" color="red"><%=add(a,b)%></font> <br>

Welcome <%=name%>