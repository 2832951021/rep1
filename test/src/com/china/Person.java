package com.china;

public class Person {
	private String sno;
	private String name;
	private int age;
	private String sex;
	
	public Person(){
	}
	public void setsno(String sno){
		this.sno=sno;
	}
	public String getsno(){
		return sno;
	}
	public void setname(String name){
		this.name=name;
	}
	public String getname(){
		return name;
	}
	public void setage(int age){
		this.age=age;
	}
	public int getage(){
		return age;
	}
	public void setsex(String sex){
		this.sex=sex;
	}
	public String getsex(){
		return sex;
	}
	public void sleeping(){
		System.out.println("����˯����");
	}
	public void talk(){
		System.out.println("�ҵ�������"+ this.name+"��ѧ����"+this.sno+"���Ա���"+this.sex+"��������"+this.age+"��");
}
}
