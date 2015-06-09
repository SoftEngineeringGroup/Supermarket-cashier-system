package service.impl;

import hib.Client;
import service.ClientService;
import service.IClientDAO;

public class ClientServiceImpl implements ClientService {

	public IClientDAO clientDAO;
	public IClientDAO getClientDAO(){return clientDAO;}
	public void setClientDAO(IClientDAO clientDAO){this.clientDAO=clientDAO;}
	@Override
	public void addClient(Client client) {
		// TODO Auto-generated method stub
		clientDAO.save(client);
	}

}
