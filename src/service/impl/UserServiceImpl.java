package service.impl;
import java.util.List;

import service.IUserDAO;
import hib.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	public IUserDAO userDAO;
	public IUserDAO getUserDAO(){return userDAO;}
	public void setUserDAO(IUserDAO userDAO){this.userDAO=userDAO;}
	
	@Override
	public User getuserbyname(String userName) {
		User user=null;
		List list=userDAO.findByUserName(userName);
		if(list.size()>0)user=(User)list.get(0);
		return user;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}
	public boolean validUser(User user) {
		// TODO Auto-generated method stub
		//System.out.println(user.getUserName());
		User e=getuserbyname(user.getUserName());
		//System.out.println(e.getPassword());
		if (e==null) 
		{return false;}
		else
		{
			return e.getPassword().equals(user.getPassword());
		}
	}
}
