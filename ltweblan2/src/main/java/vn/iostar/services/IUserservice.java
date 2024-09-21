package vn.iostar.services;

import vn.iostar.models.UserModel;

public interface IUserservice {
	UserModel login (String username, String password);
	
	UserModel FindByUsername(String username);
	
}
