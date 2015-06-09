package service.impl;

import java.util.List;

import hib.Salegoods;
import service.ISalegoodsDAO;
import service.SalegoodsService;

public class SalegoodsServiceImpl implements SalegoodsService {
	public ISalegoodsDAO salegoodsDAO;
	public ISalegoodsDAO getSalegoodsDAO(){return salegoodsDAO;}
	public void setSalegoodsDAO(ISalegoodsDAO salegoodsDAO){this.salegoodsDAO=salegoodsDAO;}
	@Override
	public void updateSalegoods(Salegoods salegoods) {
		// TODO Auto-generated method stub
		Salegoods e=salegoodsDAO.findById(salegoods.getGoodsId());
		salegoodsDAO.delete(e);
		salegoodsDAO.save(salegoods);
		
	}

	@Override
	public Salegoods findSalegoods(int goodsid)
	{
		Salegoods e = salegoodsDAO.findById(goodsid);
		return e;
	
	}
	public List findall(){
		return salegoodsDAO.findAll();
	
	}



}