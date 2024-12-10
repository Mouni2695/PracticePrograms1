package customerTypeComparators;

public class Customer implements Comparable<Customer>{
	private String custName;
	private String custAddrese;
	private Long custMobNum;
	private Integer rating;
	private Float bill;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddrese() {
		return custAddrese;
	}
	public void setCustAddrese(String custAddrese) {
		this.custAddrese = custAddrese;
	}
	public Long getCustMobNum() {
		return custMobNum;
	}
	public void setCustMobNum(Long custMobNum) {
		this.custMobNum = custMobNum;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Float getBill() {
		return bill;
	}
	public void setBill(Float bill) {
		this.bill = bill;
	}
	public Customer(String custName, String custAddrese, Long custMobNum, Integer rating, Float bill) {
		super();
		this.custName = custName;
		this.custAddrese = custAddrese;
		this.custMobNum = custMobNum;
		this.rating = rating;
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custAddrese=" + custAddrese + ", custMobNum=" + custMobNum
				+ ", rating=" + rating + ", bill=" + bill + "]";
	}
	@Override
	public int compareTo(Customer o) {
		
		return this.custName.compareTo(o.getCustName());
	}
	
	
	
	

}
