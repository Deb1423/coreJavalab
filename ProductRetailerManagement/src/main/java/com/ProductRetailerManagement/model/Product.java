package com.ProductRetailerManagement.model;

public class Product {
	private int batchid;
	private String productname;
	private String producttype;
	private int quantity;
	private double price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int batchid, String productname, String producttype, int quantity, double price) {
		super();
		this.batchid = batchid;
		this.productname = productname;
		this.producttype = producttype;
		this.quantity = quantity;
		this.price = price;

	}

	public int getBatchid() {
		return batchid;
	}

	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		return "Product[batchid=" + batchid + ", productname=" + productname + ",producttype=" + producttype
				+ ", quantity=" + quantity + " , price =" + price + "]";
	}

}
