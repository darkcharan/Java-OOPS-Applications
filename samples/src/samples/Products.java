package samples;

public class Products {
	int pid;
	String pname;
	
	void product()
	{
		 pid=100;
		 pname="samsung";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Products p=new Products();
		
		System.out.println(p.pid+"\t"+p.pname);
		
		p.product();
		System.out.println(p.pid+"\t"+p.pname);

	}

}
