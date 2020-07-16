package com.china;

public class UserDaoImpl implements IUserDao {

	@Override
	public int saveUser(User user) {
		System.out.println(user.getName());
		if(user.getAge()==0) {
			throw new CustomeException("提示信息：保存数据出现错误！！！");
		}
		return 0;

}
}
