package com.china;

public class Test {

	public static void main(String[] args) {
		User uu=new User();
		uu.setSno("18044312");
		uu.setName("���޷�");
		//uu.setAge(18);
		uu.setSex("Ů");
		uu.setAddr("�й�����");
		IUserDao dao=new UserDaoImpl();
		Service se=new Service();
		se.setDao(dao);
		se.save(uu);

	}

}
