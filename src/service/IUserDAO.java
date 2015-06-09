package service;

import hib.User;

import java.util.List;

public interface IUserDAO {

	public abstract void save(User transientInstance);

	public abstract List findByUserName(Object userName);

}