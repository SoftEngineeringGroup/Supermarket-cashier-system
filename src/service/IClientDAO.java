package service;

import hib.Client;

public interface IClientDAO {

	public abstract void save(Client transientInstance);

}