package com.studentClient;

import java.util.Scanner;

import StudentDao.StudentDaoimpl;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StudentDaoimpl st=new StudentDaoimpl();
		int k=1;
				while(k==1)
				{
		System.out.println("1)AddRecord");
		System.out.println("2)viewrecord");
		System.out.println("3)viewspecificrecord");
		System.out.println("4)updaterecord");
		System.out.println("5)deleterecord");
		System.out.println("6)exit");
		
		
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:st.addStudent();
		break;
		case 2:st.viewStudent();
		break;
		case 3:
			System.out.println("enter studnet no");
			int sno=sc.nextInt();
			st.viewSpecificStudent(sno);
			break;
		case 4:
			System.out.println("enter student no");
			int sno1=sc.nextInt();
			st.updateStudent(sno1);
		break;
		case 5:
			System.out.println("enter student no");
			int sno2=sc.nextInt();
			st.DeleteStudent(sno2);
		break;
		case 6:
			System.out.println("tq u for using student");
			System.exit(0);
		}

	}

}
}