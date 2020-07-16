package com.china;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentsTest {

	public static void main(String[] args) {
		Student S1=new Student();
		S1.setName("张三");
		S1.setAge(20);
		S1.setSex("男");
		Student S2=new Student();
		S2.setName("李四");
		S2.setAge(19);
		S2.setSex("女");
		Student S3=new Student();
		S3.setName("王五");
		S3.setAge(23);
		S3.setSex("男");
		TreeSet a = new  TreeSet();
		a.add(S1);
		a.add(S2);
		a.add(S3);
		Iterator iterator = a.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());	
        }

	}

}
