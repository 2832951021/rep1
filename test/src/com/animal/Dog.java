package com.animal;

public class Dog {
	private String name;
	private int age;
	private String sex;
	
	public Dog(){
		
	}
	public Dog(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
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
		System.out.println("����˯��");
	}
	public void talk(){
		System.out.println("������:"+ this.name+"���Ա���:"+this.sex+"��������"+this.age+"��");
	}
}
