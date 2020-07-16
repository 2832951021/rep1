package com.china;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class TestIDCard {

	public static void main(String[] args) {
		String stu1="2000-12-20 16:00:00";
		String stu2="1998-05-09 17:00:00";
		LocalDateTime ldt1 =null;
		LocalDateTime ldt2 =null;
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		ldt1 = LocalDateTime.parse(stu1,dtf);
		ldt2 = LocalDateTime.parse(stu2,dtf);
		IDCard id1=new IDCard();
		id1.setName("张三");
		id1.setNation("汉");
		id1.setSex("男");
		id1.setCardNo("230101199001021789");
		id1.setAddr("黑龙江省哈尔滨市");
		id1.setBirthday(ldt1);
		IDCard id2=new IDCard();
		id2.setName("李四");
		id2.setNation("汉");
		id2.setSex("女");
		id2.setCardNo("230106200111221621");
		id2.setAddr("黑龙江省大庆市");
		id2.setBirthday(ldt2);
		IDCard id3=new IDCard();
		id3.setName("张三");
		id3.setNation("汉");
		id3.setSex("男");
		id3.setCardNo("230101199001021789");
		id3.setAddr("黑龙江省哈尔滨市");
		id3.setBirthday(ldt1);	
		HashSet hash=new HashSet();
		hash.add(id1);
		hash.add(id2);
		hash.add(id3);	
		System.out.println(hash);

	}

}
