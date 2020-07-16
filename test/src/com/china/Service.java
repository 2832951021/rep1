package com.china;

public class Service {
	private IUserDao dao;

	public IUserDao getDao() {
		return dao;
	}

	public void setDao(IUserDao dao) {
		this.dao = dao;
	}
	
	public boolean save(User u) {
		boolean flag=false;
		
		try {
		this.dao.saveUser(u);
		}catch(CustomeException e) {
		e.printStackTrace();
	}
	return flag;

	}
}
