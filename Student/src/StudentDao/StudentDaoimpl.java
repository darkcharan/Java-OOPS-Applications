package StudentDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import StudentBean.Student;

public class StudentDaoimpl implements StudentDao {
	Scanner sc=new Scanner(System.in);
	Student st=null;
	List<Student>addRecords=new ArrayList<Student>();

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		int k=1;
		while(k==1)
		{
		System.out.println("enter student no");
		int sno=sc.nextInt();
		System.out.println("enter student name");
		String sname=sc.next();
		System.out.println("enter student address");
		String saddr=sc.next();
		st=new Student(sno,sname,saddr);
		addRecords.add(st);
		System.out.println("do you want to add records 1)yes 2)no");
		k=sc.nextInt();
		}

	}

	@Override
	public void viewStudent() {
		// TODO Auto-generated method stub
		for(Student bean:addRecords)
		{
			System.out.println(bean);
		}

	}

	@Override
	public void viewSpecificStudent(int sno) {
		// TODO Auto-generated method stub
		int k=0;
		for(Student bean:addRecords)
		{
			if(bean.getSno()==sno)
			{
				k++;
				System.out.println(bean);
			}
			else
			{
				System.out.println("not found");
			}
		}
		

	}

	@Override
	public void updateStudent(int sno) {
		// TODO Auto-generated method stub
		int k=0;
		for(Student bean:addRecords)
		{
			if(bean.getSno()==sno)
			{
				k=1;
				System.out.println("which record you want to update 1)name 2)address");
				System.out.println("enter your choice");
				int choice =sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("enter updated name");
					String sname=sc.next();
					bean.setSname(sname);
					break;
				case 2:
					System.out.println("enter updated address");
					String saddr=sc.next();
					bean.setSaddr(saddr);
					break;
					default:System.out.println("enter your choice from 1 to 2");
				}
				
			}
			if(k==0)
			{
				System.out.println("record is not updated");
			}
			else
			{
				System.out.println("record is  updated");
			}
		}

	}

	@Override
	public void DeleteStudent(int sno) {
		// TODO Auto-generated method stub
		int k=0;
		for(Student bean:addRecords)
		{
			if(bean.getSno()==sno)
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
