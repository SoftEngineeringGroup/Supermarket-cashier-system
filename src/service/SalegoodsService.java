
	package service;
	import java.util.List;
	import hib.Salegoods;
	public interface SalegoodsService {
	public void updateSalegoods(Salegoods salegoods);
	public Salegoods findSalegoods(int goodsid);
	public List findall();
	}
