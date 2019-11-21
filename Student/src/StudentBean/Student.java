package StudentBean;

public class Student {
	
	int sno;
	String sname;
	String saddr;
	public Student(int sno, String sname, String saddr) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.saddr = saddr;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	@Override
	public String toString() {
		return "" + sno + "\t" + sname + "\t" + saddr + "";
	}
	
	

}
