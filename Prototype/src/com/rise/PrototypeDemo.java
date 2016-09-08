package com.rise;

public class PrototypeDemo {

	public static void main(String[] args) {

		Product product = new Product("Nexus 4");
		Offer offer = new Offer();
		offer.setOfferName("5% Off");
		offer.setPrice(22000);;
		product.setOffer(offer);
		
		System.out.println("Product Name : " + product.getProductName() + ", Offer : " + 
				product.getOffer().getOfferName() + ", Price : " + product.getOffer().getPrice());

		CloneFactory factory = new CloneFactory();
		Product clonedProduct = (Product) factory.makeClone(product);
		clonedProduct.setProductName("Samsung");
		clonedProduct.getOffer().setOfferName("10% Off");

		System.out.println("Cloned Product Name : " + clonedProduct.getProductName() + ", Offer : " + 
				clonedProduct.getOffer().getOfferName() + ", Price : " + clonedProduct.getOffer().getPrice());

		System.out.println("Product Name : " + product.getProductName() + ", Offer : " +
				product.getOffer().getOfferName() + ", Price : " + product.getOffer().getPrice());

	}

}
