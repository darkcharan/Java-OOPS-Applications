package samples;

public class Employee {
	
	int eno;
	String ename;
	String eaddr;
	double esalr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		
		e.eno=100;
		e.ename="alex";
		e.eaddr="hyd";
		e.esalr=10000;
		
		System.out.println(e.eno+"\t"+e.ename+"\t"+e.eaddr+"\t"+e.esalr);
		

	}

}
