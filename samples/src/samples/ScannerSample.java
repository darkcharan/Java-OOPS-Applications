package samples;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter student number");
		int sno=sc.nextInt();
		System.out.println("enter student name");
		String sname=sc.next();
		System.out.println("enter student address");
		String saddr=sc.next();
		System.out.println("enter student mobileno");
		double smobileno=sc.nextDouble();
		System.out.println("enter student age");
		int sage=sc.nextInt();
		System.out.println("enter student fees");
		double sfees=sc.nextDouble();
		
		System.out.println("number"+"\t"+"name"+"\t"+"address"+"\t"+"mobileno"+"\t"+"age"+"\t"+"fees");
		System.out.println(sno+"\t"+sname+"\t"+saddr+"\t"+smobileno+"\t"+sage+"\t"+sfees);

	}

}
