package intermediate_terminalOperations;

public class Vegitables {
	private String names;
	private Float quantity;
	private Integer price;
	public final String getNames() {
		return names;
	}
	public final void setNames(String names) {
		this.names = names;
	}
	public final Float getQuantity() {
		return quantity;
	}
	public final void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	public final Integer getPrice() {
		return price;
	}
	public final void setPrice(Integer price) {
		this.price = price;
	}
	public Vegitables(String names, Float quantity, Integer price) {
		super();
		this.names = names;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vegitables [names=" + names + ", quantity=" + quantity + ", price=" + price + "]";
	}
	

}
