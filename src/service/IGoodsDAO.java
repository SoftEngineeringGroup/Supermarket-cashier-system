package service;

import hib.Goods;

import java.util.List;

public interface IGoodsDAO {

	public abstract void save(Goods transientInstance);

	public abstract void delete(Goods persistentInstance);

	public abstract Goods findById(java.lang.Integer id);

	public abstract List findAll();

}