package in.co.rays.project_3.dto;

import java.util.Date;

public class CartDTO extends BaseDTO {

	private String customerName;
	private Integer product;
	private Date transactionDate;
	private Integer quantity;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getProduct() {
		return product;
	}

	public void setProduct(Integer product) {
		this.product = product;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return customerName;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}
}
