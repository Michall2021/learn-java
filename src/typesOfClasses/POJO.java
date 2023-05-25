package typesOfClasses;

import java.math.BigDecimal;

public class POJO {
	private String name;
	private BigDecimal price;
	
	public void Product() {
	}
	
	public void Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
