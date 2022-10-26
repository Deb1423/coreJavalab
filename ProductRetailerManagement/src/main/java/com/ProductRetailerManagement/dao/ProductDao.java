package com.ProductRetailerManagement.dao;

import com.ProductRetailerManagement.model.Product;

public interface ProductDao {

	void addProduct();

	boolean deleteProduct(int batchid);

	Product findProduct(int batchid);

	void displayAll();

}
