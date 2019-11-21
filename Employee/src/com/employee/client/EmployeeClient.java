package com.employee.client;

import java.util.Scanner;

import com.employeeDao.EmployeeDaoImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeDaoImpl emp=new EmployeeDaoImpl();
		int k=1;
		while(k==1)
		{
		System.out.println("1)Add Records");
		System.out.println("2)View Records");
		System.out.println("3)View Specific Record");
		System.out.println("4)Update Record");
		System.out.println("5)Delete Record");
		System.out.println("6)Exit");
		
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			emp.AddEmployee();
			break;
		case 2:
			emp.ViewEmployee();
			break;
		case 3:
			System.out.println("enter employee number");
			int eno=sc.nextInt();
			emp.ViewEmployee(eno);
			break;
		case 4:
			System.out.println("enter employee number");
			int eno1=sc.nextInt();
			emp.UpdateEmployee(eno1);
			break;
		case 5:
			System.out.println("enter employee number");
			int eno2=sc.nextInt();
			emp.DeleteEmployee(eno2);
			break;
		case 6:
			System.out.println("tq u for using application");
			System.exit(0);
		}

	}

}
}