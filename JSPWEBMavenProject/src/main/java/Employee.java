
public class Employee 
{
	private String empname;
	private String empgender;
	private double empsalary;
	private String empjoiningdate;
	private boolean empmanager;
	private int empid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpgender() {
		return empgender;
	}
	public void setEmpgender(String empgender) {
		this.empgender = empgender;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpjoiningdate() {
		return empjoiningdate;
	}
	public void setEmpjoiningdate(String empjoiningdate) {
		this.empjoiningdate = empjoiningdate;
	}
	public boolean isEmpmanager() {
		return empmanager;
	}
	public void setEmpmanager(boolean empmanager) {
		this.empmanager = empmanager;
	}
}
