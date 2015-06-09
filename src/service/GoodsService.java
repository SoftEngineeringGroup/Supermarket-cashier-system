
	package service;
	import hib.Goods;
	import java.util.List;
	public interface GoodsService {
	public void updateGoods(Goods goods);
	public Goods findGoods(int goodsid);
	public String findGoodsname(int goodsid);
	public double findGoodsprice(int goodsid);
	public double findGoodsmemberprice(int goodsid);
	public List findallgoods();
	}



