package com.china;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudent {

	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.setName("����");
		stu1.setAge(20);
		stu1.setSex("��");
		Student stu2=new Student();
		stu2.setName("����");
		stu2.setAge(19);
		stu2.setSex("Ů");
		Student stu3=new Student();
		stu3.setName("����");
		stu3.setAge(23);
		stu3.setSex("��");
		ArrayList q = new  ArrayList();
		q.add(stu1);
		q.add(stu2);
		q.add(stu3);
		System.out.println("for������");
		for (Object p : q){
			Student S=(Student)p;
			S.printInfo();
		}
		System.out.println("������������");
		Iterator iterator = q.iterator();
	    while(iterator.hasNext()) {
	    	Student S=(Student) iterator.next();
	        S.printInfo();   	
	    }

	}

}
