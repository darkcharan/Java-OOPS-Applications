package samples;

public class Product {
	
	int pid;
	String pname;
	
	void displaydetails()
	{
		 pid=100;
		 pname="tv";
	}
	public static void main(String[] args)
	{
		Product p=new Product();
	    System.out.println(p.pid+"\t"+p.pname);
	    p.displaydetails();
	    System.out.println(p.pid+"\t"+p.pname);
	}

}
