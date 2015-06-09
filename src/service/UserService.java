package service;
import hib.User;
public interface UserService {
public User getuserbyname(String username);
public void addUser(User user);
public boolean validUser(User user);
}
