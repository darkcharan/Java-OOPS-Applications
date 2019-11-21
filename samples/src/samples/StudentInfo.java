package samples;

public class StudentInfo {
	int sno;
	String sname;
	String saddr;
	String sgrade;
	int    spercentage;
	
	void StudentDetails()
	{
		sno=100;
		sname="alex";
		saddr="hyd";
		sgrade="A grade";
		spercentage=70;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo stu=new StudentInfo();
		
		System.out.println("stuno"+"\t"+"stuname"+"\t"+"stuaddr"+"\t"+"stugrage"+"\t"+"stupercentage");
		
		System.out.println(stu.sno+"\t"+stu.sname+"\t"+stu.saddr+"\t"+stu.sgrade+"\t"+stu.spercentage);
		
		stu.StudentDetails();
		
		System.out.println(stu.sno+"\t"+stu.sname+"\t"+stu.saddr+"\t"+stu.sgrade+"\t"+stu.spercentage);

		
		

	}

}
