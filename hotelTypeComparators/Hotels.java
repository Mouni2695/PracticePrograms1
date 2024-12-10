package hotelTypeComparators;

public class Hotels implements Comparable<Hotels>{
	private String htlName;
	private String empDetails;
	private Integer No_of_Rooms;
	private Integer restaurents;
	private Integer salesDetails;
	private Short rating;
	private String location;
	
	public String getHtlName() {
		return htlName;
	}
	public void setHtlName(String htlName) {
		this.htlName = htlName;
	}
	public String getEmpDetails() {
		return empDetails;
	}
	public void setEmpDetails(String empDetails) {
		this.empDetails = empDetails;
	}
	public Integer getNo_of_Rooms() {
		return No_of_Rooms;
	}
	public void setNo_of_Rooms(Integer no_of_Rooms) {
		No_of_Rooms = no_of_Rooms;
	}
	public Integer getRestaurents() {
		return restaurents;
	}
	public void setRestaurents(Integer restaurents) {
		this.restaurents = restaurents;
	}
	
	public Integer getSalesDetails() {
		return salesDetails;
	}
	public void setSalesDetails(Integer salesDetails) {
		this.salesDetails = salesDetails;
	}
	public Short getRating() {
		return rating;
	}
	public void setRating(Short rating) {
		this.rating = rating;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Hotels(String htlName, String empDetails, Integer no_of_Rooms, Integer restaurents, Integer salesDetails,String location,Short rating) {
		super();
		this.htlName = htlName;
		this.empDetails = empDetails;
		No_of_Rooms = no_of_Rooms;
		this.restaurents = restaurents;
		this.salesDetails = salesDetails;
		this.location =location;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Hotels [htlName=" + htlName + ", empDetails=" + empDetails + ", No_of_Rooms=" + No_of_Rooms
				+ ", restaurents=" + restaurents + ", salesDetails=" + salesDetails + ",location=" + location+ ", rating=" +rating+ "]";
	}
	@Override
	public int compareTo(Hotels h) {
		// TODO Auto-generated method stub
		return this.getRating().compareTo(h.getRating());
	}
	
	

}
