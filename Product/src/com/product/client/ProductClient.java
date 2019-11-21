package com.product.client;

import java.util.Scanner;

import com.product.Dao.ProductDaoImpl;

public class ProductClient {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ProductDaoImpl pb=new ProductDaoImpl();
		int k=1;
		while(k==1)
		{
		System.out.println("1)Addproduct");
		System.out.println("2)View Product");
		System.out.println("3)View Specific product");
		System.out.println("4)Update product");
		System.out.println("5)Delete Product");
		System.out.println("6)Exit");
		
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			pb.AddProduct();
			break;
		case 2:
			pb.viewProduct();
			break;
		case 3:
			System.out.println("enter product id");
			int pid=sc.nextInt();
			pb.ViewSpecificProduct(pid);
			break;
		case 4:
			System.out.println("enter product id");
			int pid1=sc.nextInt();
			pb.UpdateProduct(pid1);
			break;
		case 5:
			System.out.println("enter product id");
			int pid2=sc.nextInt();
			pb.DeleteProduct(pid2);
			break;
		case 6:
			System.out.println("tq for using application");
			System.exit(0);
		}
	}

}
}