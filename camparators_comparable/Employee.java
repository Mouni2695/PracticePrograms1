package camparators_comparable;

public class Employee implements Comparable<Employee> {
	private Integer emp_ID;
	private String emp_Name;
	private String emp_Address;
	private Float salary;
	private String designation;
	public Integer getEmp_ID() {
		return emp_ID;
	}
	public void setEmp_ID(Integer emp_ID) {
		this.emp_ID = emp_ID;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getEmp_Address() {
		return emp_Address;
	}
	public void setEmp_Address(String emp_Address) {
		this.emp_Address = emp_Address;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public int compareTo(Employee o) {
		//
		return this.emp_ID.compareTo(o.emp_ID);
	}
	@Override
	public String toString() {
		return "Employee [emp_ID=" + emp_ID + ", emp_Name=" + emp_Name + ", emp_Address=" + emp_Address + ", salary="
				+ salary + ", designation=" + designation + "]";
	}
	/*public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmp_ID(101);
		e.setEmp_Name("Mounika");
		e.setEmp_Address("Andra");
		e.setDesignation("Software Engineer");
		e.setSalary(30000.00f);
		System.out.println(e);
		
		Employee e1=new Employee();
		e1.setEmp_ID(102);
		e1.setEmp_Name("Mahi");
		e1.setEmp_Address("Hyderabad");
		e1.setDesignation("AssociateSoftware Engineer");
		e1.setSalary(25000.00f);
		System.out.println(e1);
	
	}*/

}
