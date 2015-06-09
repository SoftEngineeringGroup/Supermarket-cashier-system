package service.impl;

import java.util.List;

import hib.Goods;
import service.IGoodsDAO;
import service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	public IGoodsDAO goodsDAO;
	public IGoodsDAO getGoodsDAO(){return goodsDAO;}
	public void setGoodsDAO(IGoodsDAO goodsDAO){this.goodsDAO=goodsDAO;}
	@Override
	public void updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		Goods e=goodsDAO.findById(goods.getGoodsId());
		goodsDAO.delete(e);
		goodsDAO.save(goods);
		
	}

	@Override
	public Goods findGoods(int goodsid)
	{
		Goods e = goodsDAO.findById(goodsid);
		return e;
	
	}
	public String findGoodsname(int goodsid) {
		// TODO Auto-generated method stub
		Goods goods=null;
		goods=goodsDAO.findById(goodsid);
		return goods.getGoodsName();	
	}
	public double findGoodsprice(int goodsId)
	{
		Goods goods=null;
		goods=goodsDAO.findById(goodsId);
	
		return goods.getPrice();
	}
	public double findGoodsmemberprice(int goodsId)
	{
		
		Goods goods=null;
		goods=(Goods)goodsDAO.findById(goodsId);
		return goods.getMemberPrice();
		
	 }
	public List findallgoods()
	{
		
		return goodsDAO.findAll();
		
		
	}


}