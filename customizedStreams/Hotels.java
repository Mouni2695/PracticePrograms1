package customizedStreams;

public class Hotels {
	private String hotelName;
	private String location;
	private String starcategiry;
	private double prices;
	public final String getHotelName() {
		return hotelName;
	}
	public final void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public final String getLocation() {
		return location;
	}
	public final void setLocation(String location) {
		this.location = location;
	}
	public final String getStarcategiry() {
		return starcategiry;
	}
	public final void setStarcategiry(String starcategiry) {
		this.starcategiry = starcategiry;
	}
	public final double getPrices() {
		return prices;
	}
	public final void setPrices(double prices) {
		this.prices = prices;
	}
	public Hotels(String hotelName, String location, String starcategiry, double prices) {
		super();
		this.hotelName = hotelName;
		this.location = location;
		this.starcategiry = starcategiry;
		this.prices = prices;
	}
	@Override
	public String toString() {
		return "Hotels [hotelName=" + hotelName + ", location=" + location + ", starcategiry=" + starcategiry
				+ ", prices=" + prices + "]";
	}
}
