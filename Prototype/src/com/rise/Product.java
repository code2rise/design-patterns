package com.rise;

public class Product implements Prototype {
	
	private Offer offer = null;
	private String productName = "";

	public Product(String productName) {
		this.setProductName(productName);
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	@Override
	public Prototype makeClone() {
		Product product = null;
		
		try {
			product = (Product) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return product;
	}
}
