package vn.iostar.services.impl;

import vn.iostar.dao.IUserDao;
import vn.iostar.dao.impl.UserDaoImpl;
import vn.iostar.models.UserModel;
import vn.iostar.services.IUserservice;

public class UserService implements IUserservice{
	
	IUserDao userDao = new UserDaoImpl();//lấy toàn bộ hàm trong tầng Dao của user
	
	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.FindByUsername(username);
		if (user != null && password.equals(user.getPassword())) {
		return user;
		}
		return null;
	}

	@Override
	public UserModel FindByUsername(String username) {
		return  userDao.FindByUserName(username);
	}

}
