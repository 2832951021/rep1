package com.china;

public class UserDaoImpl implements IUserDao {

	@Override
	public int saveUser(User user) {
		System.out.println(user.getName());
		if(user.getAge()==0) {
			throw new CustomeException("��ʾ��Ϣ���������ݳ��ִ��󣡣���");
		}
		return 0;

}
}
