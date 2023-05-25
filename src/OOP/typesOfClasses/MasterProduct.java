package typesOfClasses;

import java.math.BigDecimal;

public class MasterProduct extends Product
{
	private boolean isAvailableForLease;

	@Override
	public boolean isAvailableInStock() {
		return getRemainingAmountInStock() > 0;
	}

	@Override
	protected BigDecimal getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

}
