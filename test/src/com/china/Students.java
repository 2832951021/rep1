package com.china;

public class Students implements Comparable {
	private String name;
	private int age;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String toString(){
		String str="[姓名:"+this.name+", 年龄:"+this.age+", 性别:"+this.sex+"]";
		return str;
	}
	public int compareTo(Object arg0) {
		Student S=(Student)arg0;
		int A=S.getAge();
		int n=0;
		if(this.age>A){
			n=-1;
			return n;
		}else{
			return 1;
		}
	}
}
