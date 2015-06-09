package service;

import hib.Salegoods;

import java.util.List;

public interface ISalegoodsDAO {

	public abstract void save(Salegoods transientInstance);

	public abstract void delete(Salegoods persistentInstance);

	public abstract Salegoods findById(java.lang.Integer id);

	public abstract List findAll();

}