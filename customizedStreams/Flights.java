package customizedStreams;

public class Flights {
	private String name;
	private int number;
	private String boardingpoint;
	private String destination;
	private short seatNum;
	private float prices;
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getNumber() {
		return number;
	}
	public final void setNumber(int number) {
		this.number = number;
	}
	public final String getBoardingpoint() {
		return boardingpoint;
	}
	public final void setBoardingpoint(String boardingpoint) {
		this.boardingpoint = boardingpoint;
	}
	public final String getDestination() {
		return destination;
	}
	public final void setDestination(String destination) {
		this.destination = destination;
	}
	public final short getSeatNum() {
		return seatNum;
	}
	public final void setSeatNum(short seatNum) {
		this.seatNum = seatNum;
	}
	public final float getPrices() {
		return prices;
	}
	public final void setPrices(float prices) {
		this.prices = prices;
	}
	public Flights(String name, int number, String boardingpoint, String destination, short seatNum, float prices) {
		super();
		this.name = name;
		this.number = number;
		this.boardingpoint = boardingpoint;
		this.destination = destination;
		this.seatNum = seatNum;
		this.prices = prices;
	}
	@Override
	public String toString() {
		return "Flights [name=" + name + ", number=" + number + ", boardingpoint=" + boardingpoint + ", destination="
				+ destination + ", seatNum=" + seatNum + ", prices=" + prices + "]";
	}

}
