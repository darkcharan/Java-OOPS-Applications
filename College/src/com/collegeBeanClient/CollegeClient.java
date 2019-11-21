package com.collegeBeanClient;

import java.util.Scanner;

import com.collegeDao.CollegeDaoImpl;

public class CollegeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		CollegeDaoImpl cb=new CollegeDaoImpl();
		int k=1;
		while(k==1)
		{
		System.out.println("1)AddRecord");
		System.out.println("2)ViewRecord");
		System.out.println("3)ViewSpecificRecord");
		System.out.println("4)UpdateRecord");
		System.out.println("5)DeleteRecord");
		System.out.println("6)Exit");
		
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			cb.AddCollege(); 
			break;
		case 2:
			cb.ViewCollege();
			break;
		case 3:
			System.out.println("enter college number");
			int cno=sc.nextInt();
			cb.ViewSpecificCollege(cno);
			break;
		case 4:
			System.out.println("enter college number");
			int cno1=sc.nextInt();
			cb.UpdateCollege(cno1);
			break;
		case 5: 
			System.out.println("enter college number");
			int cno2=sc.nextInt();
			cb.DeleteCollege(cno2);
			break;
		case 6:
			System.out.println("tq for using");
			System.exit(0);
			
		}

	}

}
}