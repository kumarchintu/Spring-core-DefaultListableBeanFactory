package com.inetsolv;

public class Person {
	private Integer pid;
	private String pname;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void Display()
	{
		System.out.println(pid+"--"+pname);
	}
}
