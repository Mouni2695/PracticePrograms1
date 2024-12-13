package anonymousClasses;

public class Student implements Comparable<Student>{
	int id;
	String name;
	Student() {
		
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display() {
		
	}
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.name.compareTo(s.name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
