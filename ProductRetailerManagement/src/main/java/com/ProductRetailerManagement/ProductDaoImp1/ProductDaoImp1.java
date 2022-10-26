package com.ProductRetailerManagement.ProductDaoImp1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ProductRetailerManagement.dao.ProductDao;
import com.ProductRetailerManagement.model.Product;

public class ProductDaoImp1 implements ProductDao {

	List<Product> ptList = new ArrayList<Product>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);
	// creating Employee object

	public void addProduct() {
		// TODO Auto-generated method stub

		// creating Employee object
		Product p = new Product();
		// input the details of Employee
		System.out.println("Enter the Batch id :");
		p.setBatchid(sc.nextInt());
		System.out.println("Enter the Product name :");
		p.setProductname(sc.next());
		System.out.println("Enter the Product Type :");
		p.setProducttype(sc.next());
		System.out.println("Enter the Quantity :");
		p.setQuantity(sc.nextInt());
		System.out.println("Enter the Price :");
		p.setPrice(sc.nextDouble());

		// adding the Product into the collection
		ptList.add(p);
		System.out.println(ptList);

	}

	public boolean deleteProduct(int batchid) {
		// TODO Auto-generated method stub

		boolean status = false;
		Product pdel = null;
		// finding the Product
		for (Product p : ptList) {
			if (p.getBatchid() == batchid)
				pdel = p;
		}
		// check whether the record is present
		if (pdel == null)
			status = false;
		else {
			ptList.remove(pdel);
			status = true;
		}

		return status;
	}

	public Product findProduct(int batchid) {
		// TODO Auto-generated method stub
		Product pfind = null;
		// finding the Employee
		for (Product p : ptList) {
			if (p.getBatchid() == batchid)
				pfind = p;
			return pfind;
		}
		return pfind;

	}

	public void displayAll() {
		// TODO Auto-generated method stub
		for (Product p : ptList) {
			System.out.println(p);

		}
	}
}
