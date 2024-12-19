package intermediate_terminalOperations;

public class Students {
    private String name;
    private String branch;
    private Integer marks;
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getBranch() {
		return branch;
	}
	public final void setBranch(String branch) {
		this.branch = branch;
	}
	public final Integer getMarks() {
		return marks;
	}
	public final void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	public Students(String name, String branch, int marks) {
		super();
		this.name = name;
		this.branch = branch;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Studentmarks [name=" + name + ", branch=" + branch + ", marks=" + marks + "]";
	}
    
}
