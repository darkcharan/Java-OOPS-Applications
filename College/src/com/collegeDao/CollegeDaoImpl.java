package com.collegeDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.collegeBean.CollegeBean;

public class CollegeDaoImpl implements CollegeDao {
	Scanner sc=new Scanner(System.in);
	List<CollegeBean>addRecords=new ArrayList<CollegeBean>(); 
	CollegeBean cb=null;

	@Override
	public void AddCollege() {
		// TODO Auto-generated method stub 
		int k=1;
		while(k==1) 
		{
		System.out.println("enter college number");
		int cno=sc.nextInt();
		System.out.println("enter college name");
		String cname=sc.next();
		System.out.println("enter college address");
		String caddr=sc.next();
		System.out.println("enter college fees");
		double cfees=sc.nextDouble();
		cb=new CollegeBean(cno,cname,caddr,cfees);
		addRecords.add(cb);
		System.out.println("do you want to add one more record 1)Yes 2)No");
		k=sc.nextInt();
		}
	
		

	}

	@Override
	public List<CollegeBean> ViewCollege() {
		// TODO Auto-generated method stub
		for(CollegeBean bean:addRecords)
		{
			System.out.println(bean);
		}
		return null;
	}

	@Override
	public void ViewSpecificCollege(int cno) {
		// TODO Auto-generated method stub
		int k=0;
		for(CollegeBean bean:addRecords)
		{
			if(bean.getCno()==cno)
			{
				k++;
				System.out.println(bean);
			}
		}

	}

	@Override
	public Void UpdateCollege(int cno) {
		// TODO Auto-generated method stub
		int k=0;
		for(CollegeBean bean:addRecords)
		{ 
			if(bean.getCno()==cno)
			{
				System.out.println("which record you want to update 1)Name 2)Address 3)fees");
				System.out.println("enter your choice");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("enter update college name");
					String cname=sc.next();
					bean.setCname(cname);
					break; 
				case 2:
					System.out.println("enter updated college address");
					String caddr=sc.next();
					bean.setCaddr(caddr);
					break;
				case 3:
					System.out.println("enter updated college fees");
					double cfees=sc.nextDouble();
					bean.setCfees(cfees);
					break;
					default:
						System.out.println("select from 1 to 3");
				}
			}
		}
		if(k==0)
		{
			System.out.println("Record is updated");
		}
		else
		{
			System.out.println("Record is not updated");
		}
		
		return null;
	}

	@Override
	public void DeleteCollege(int cno) {
		// TODO Auto-generated method stub
		int k=0;
		for(CollegeBean bean:addRecords)
		{ 
			if(bean.getCno()==cno)
			{
				k++;
				addRecords.remove(bean);
			}
		}
		if(k==0)
		{
			System.out.println("Deleted sucessfully");
		}
		else
		{
			System.out.println("not deleted");
		}

	}

}
