package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactuteDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactuteDate) {
		super(name, price);
		this.manufactuteDate = manufactuteDate;
	}

	public Date getManufactuteDate() {
		return manufactuteDate;
	}

	public void setManufactuteDate(Date manufactuteDate) {
		this.manufactuteDate = manufactuteDate;
	}

	@Override
	public String priceTag() {
		return getName() + " (used) $ " + totalPrice() + " (Manufacture date: " + sdf.format(this.manufactuteDate) + ")";
	}
	
	
}
