package com.china;

public class Test {

	public static void main(String[] args) {
		User uu=new User();
		uu.setSno("18044312");
		uu.setName("罗艳芳");
		//uu.setAge(18);
		uu.setSex("女");
		uu.setAddr("中国海南");
		IUserDao dao=new UserDaoImpl();
		Service se=new Service();
		se.setDao(dao);
		se.save(uu);

	}

}
