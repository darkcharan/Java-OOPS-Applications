package com.collegeBean;

public class CollegeBean {
	
	private int cno;
	private String cname;
	private String caddr;
	private double cfees;
	public CollegeBean(int cno, String cname, String caddr, double cfees) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.caddr = caddr;
		this.cfees = cfees;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddr() {
		return caddr;
	}
	public void setCaddr(String caddr) {
		this.caddr = caddr;
	}
	public double getCfees() {
		return cfees;
	}
	public void setCfees(double cfees) {
		this.cfees = cfees;
	}
	@Override
	public String toString() {
		return "" + cno + "\t" + cname + "\t" + caddr + "\t" + cfees + "";
	}
	

}
