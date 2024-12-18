package customizedStreams;

public class Hospitals {
	private String name;
	private String location;
	private String specialization;
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getLocation() {
		return location;
	}
	public final void setLocation(String location) {
		this.location = location;
	}
	public final String getSpecialization() {
		return specialization;
	}
	public final void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public Hospitals(String name, String location, String specialization) {
		super();
		this.name = name;
		this.location = location;
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Hospitals [name=" + name + ", location=" + location + ", specialization=" + specialization + "]";
	}
	
	

}
