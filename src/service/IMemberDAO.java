package service;

import hib.Member;

public interface IMemberDAO {

	public abstract void save(Member transientInstance);

	public abstract Member findById(java.lang.Integer id);

}