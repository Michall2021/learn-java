package typesOfClasses;

import java.math.BigDecimal;

public class MasterProduct extends Product{
	public MasterProduct(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private boolean isAvailableForLease;

	@Override
	public boolean isAvailableInStock() {
		return getRemainingAmountInStock() > 0;
	}

	@Override
	public BigDecimal getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
}
