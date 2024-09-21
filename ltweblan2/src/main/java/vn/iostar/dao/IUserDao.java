package vn.iostar.dao;

import java.util.List;

import vn.iostar.models.UserModel;

public interface IUserDao {
	
	List<UserModel> FindAll();
	
	UserModel FindById(int id);
	
	void insert(UserModel user);
	
	UserModel FindByUserName(String username);
}
