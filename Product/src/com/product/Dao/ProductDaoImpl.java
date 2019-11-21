package com.product.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.product.bean.ProductBean;

public class ProductDaoImpl implements ProductDao {
	Scanner sc=new Scanner(System.in);
	List<ProductBean>addRecords=new ArrayList<ProductBean>();
	ProductBean pb=null;

	@Override
	public void AddProduct() {
		// TODO Auto-generated method stub
		int k=1;
		while(k==1)
		{
		System.out.println("enter product number");
		int pid=sc.nextInt();
		System.out.println("enter product name");
		String pname=sc.next();
		System.out.println("enter product type");
		String ptype=sc.next();
		System.out.println("enter product value");
		double pvalue=sc.nextDouble();
		pb=new ProductBean(pid,pname,ptype,pvalue);
		addRecords.add(pb);
		System.out.println("do u want to add record 1)Yes 2)No");
		k=sc.nextInt();
		}

	}

	@Override
	public List<ProductBean> viewProduct() {
		// TODO Auto-generated method stub
		for(ProductBean bean:addRecords)
		{
			System.out.println(bean);
		}
		return null;
	}

	@Override
	public void ViewSpecificProduct(int pid) {
		// TODO Auto-generated method stub
		int k=0;
		for(ProductBean bean:addRecords)
		{
			if(bean.getPid()==pid)
			{
				k++;
			   System.out.println(bean);
			   break;
			}
		}
		if(k==0)
		{
			System.out.println("record  found");
		}
		else
		{
			System.out.println("record not found");
		}

	}

	@Override
	public void UpdateProduct(int pid) {
		// TODO Auto-generated method stub
		int k=0;
		for(ProductBean bean:addRecords)
		{
			if(bean.getPid()==pid)
			{
				System.out.println("which record you want to update 1)Name 2)type 3)value");
				System.out.println("enter your choice");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("enter updated product name");
					String pname=sc.next();
					bean.setPname(pname);
					break;
				case 2:
					System.out.println("enter updated product type");
					String ptype=sc.next();
					bean.setPtype(ptype);
					break;
				case 3:
					System.out.println("enter updated product value");
					double pvalue=sc.nextDouble();
					bean.setPvalue(pvalue);
					break;
					default:
						System.out.println("enter your choice from 1 to 3");
				}
			}
		}
		if(k==0)
		{
			System.out.println("record is updated");
		}
		else
		{
			System.out.println("record is not deleted");
		}

	}

	@Override
	public void DeleteProduct(int pid) {
		// TODO Auto-generated method stub
		int k=0;
		for(ProductBean bean:addRecords)
		{
			if(bean.getPid()==pid)
			{
				k++;
				addRecords.remove(bean);
			}
		}
		if(k==0)
		{
			System.out.println("record is deleted");
		}
		else
		{
			System.out.println("record is not deleted");
		}
		

	}

}
