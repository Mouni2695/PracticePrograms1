package customizedStreams;

public class Employee {
	private int empid;
	private String empName;
	private String companyName;
	private String designation;
	private float salary;
	public final int getEmpid() {
		return empid;
	}
	public final void setEmpid(int empid) {
		this.empid = empid;
	}
	public final String getEmpName() {
		return empName;
	}
	public final void setEmpName(String empName) {
		this.empName = empName;
	}
	public final String getCompanyName() {
		return companyName;
	}
	public final void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public final String getDesignation() {
		return designation;
	}
	public final void setDesignation(String designation) {
		this.designation = designation;
	}
	public final float getSalary() {
		return salary;
	}
	public final void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int empid, String empName, String companyName, String designation, float salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.companyName = companyName;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeStream [empid=" + empid + ", empName=" + empName + ", companyName=" + companyName
				+ ", designation=" + designation + ", salary=" + salary + "]";
	}

}
