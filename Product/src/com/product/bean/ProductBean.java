package com.product.bean;

public class ProductBean {
	private int pid;
	private String pname;
	private String ptype;
	private double pvalue;
	public ProductBean(int pid, String pname, String ptype, double pvalue) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.pvalue = pvalue;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public double getPvalue() {
		return pvalue;
	}
	public void setPvalue(double pvalue) {
		this.pvalue = pvalue;
	}
	@Override
	public String toString() {
		return "" + pid + "\t" + pname + "\t" + ptype + "\t" + pvalue + "";
	}

	
	
	
}
