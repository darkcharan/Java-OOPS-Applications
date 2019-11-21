package com.employeeDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.employee.EmployeeBean;

public class EmployeeDaoImpl implements EmployeeDao {
	Scanner sc=new Scanner(System.in);
	List<EmployeeBean>addRecords=new ArrayList<EmployeeBean>();
	EmployeeBean eb=null;

	@Override
	public void AddEmployee() {
		// TODO Auto-generated method stub
		int k=1;
		while(k==1)
		{
		System.out.println("enter employee number");
		int eno=sc.nextInt();
		System.out.println("enter employee name");
		String ename=sc.next();
		System.out.println("enter employee address");
		String eaddr=sc.next();
		System.out.println("enter employee salary");
		double esalr=sc.nextDouble();
		eb=new EmployeeBean(eno,ename,eaddr,esalr);
		addRecords.add(eb);
		System.out.println("do u want to add record 1)Yes 2)No");
		k=sc.nextInt();
		}

	}

	@Override
	public List<EmployeeBean> ViewEmployee() {
		// TODO Auto-generated method stub
		for(EmployeeBean bean:addRecords)
		{
			System.out.println(bean);
		}
		return null;
	}

	@Override
	public void ViewEmployee(int eno) {
		// TODO Auto-generated method stub
		int k=0;
		for(EmployeeBean bean:addRecords)
		{
			if(bean.getEno()==eno)
			{
				k++;
				System.out.println(bean);
			}
		}
		if(k==0)
		{
			System.out.println("record is avilable");
		}
		else
		{
			System.out.println("record is not avilable");
		}

	}

	@Override
	public void UpdateEmployee(int eno) {
		// TODO Auto-generated method stub
		int k=0;
		for(EmployeeBean bean:addRecords)
		{
			if(bean.getEno()==eno)
			{
				System.out.println("which record you want to update 1)Name 2)Address 3)Salary");
				System.out.println("enter your choice");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("enter updated name");
					String ename=sc.next();
					bean.setEname(ename);
					break;
				case 2:
					System.out.println("enter updated address");
					String eaddr=sc.next();
					bean.setEaddr(eaddr);
					break;
				case 3:
					System.out.println("enter updated salary");
					double esalr=sc.nextDouble();
					bean.setEsalr(esalr);
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
			System.out.println("record is not updated");
		}

	}

	@Override
	public void DeleteEmployee(int eno) {
		// TODO Auto-generated method stub
		int k=0;
		for(EmployeeBean bean:addRecords)
		{
			if(bean.getEno()==eno)
			{
				k++;
				addRecords.remove(bean);
			}
		}
		if(k==0)
		{
			System.out.println("record is not deleted");
		}
		else
		{
			System.out.println("record is  deleted");
		}

	}

}
