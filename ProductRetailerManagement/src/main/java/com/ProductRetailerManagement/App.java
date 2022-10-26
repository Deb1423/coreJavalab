package com.ProductRetailerManagement;

/**
 * Hello world!
 *
 */

import java.util.Scanner;

import com.ProductRetailerManagement.ProductDaoImp1.ProductDaoImp1;
import com.ProductRetailerManagement.dao.ProductDao;
import com.ProductRetailerManagement.model.Product;

public class App {
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add Product");
		System.out.println("2. Delete Product");
		System.out.println("3. Search Product");
		System.out.println("4. Display all the Products");
		System.out.println("5.Exit");
	}

	public static void main(String[] args) {
		// System.out.println( "Hello World!" );
		// creating Scanner Object
		Scanner sc1 = new Scanner(System.in);
		// creating object of impl
		ProductDao shop = new ProductDaoImp1();

		// declaring varible choice
		int m = 0;
		do {
			menu();
			m = sc1.nextInt();
			switch (m) {

			case 1:
				shop.addProduct();
				System.out.println("Product inserted..........");
				break;
			case 2:
				System.out.println("Enter the BatchId to be deleted:");
				int batchid = sc1.nextInt();
				boolean flag = shop.deleteProduct(batchid);
				if (flag)
					System.out.println("Product deleted.......");
				else
					System.out.println("Product not found......");
				break;
			case 4:
				Product p = null;
				System.out.println("Enter the BatchId to be searched:");
				batchid = sc1.nextInt();
				p = shop.findProduct(batchid);
				if (p == null)
					System.out.println("Product not found.......");
				else
					System.out.println("Product BatchId :" + p.getBatchid() + " Product Name:" + p.getProductname()
							+ " Product Type: " + p.getProducttype() + " Product Quantity:" + p.getQuantity()
							+ " Product Price:" + p.getPrice());
				break;

			case 5:
				shop.displayAll();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input.......");
			}
		} while (m != 5);

		// end of do while

		sc1.close();

	}
}
