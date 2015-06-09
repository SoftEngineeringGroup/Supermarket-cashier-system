package hib;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * EmpTable entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see hib.EmpTable
 * @author MyEclipse Persistence Tools
 */

public class EmpTableDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(EmpTableDAO.class);
	// property constants
	public static final String EMP_TYPE = "empType";
	public static final String EMP_NAME = "empName";
	public static final String EMP_PASS = "empPass";
	public static final String EMP_SALARY = "empSalary";
	public static final String DEPT_NAME = "deptName";

	protected void initDao() {
		// do nothing
	}

	public void save(EmpTable transientInstance) {
		log.debug("saving EmpTable instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(EmpTable persistentInstance) {
		log.debug("deleting EmpTable instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public EmpTable findById(java.lang.Integer id) {
		log.debug("getting EmpTable instance with id: " + id);
		try {
			EmpTable instance = (EmpTable) getHibernateTemplate().get(
					"hib.EmpTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EmpTable instance) {
		log.debug("finding EmpTable instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding EmpTable instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from EmpTable as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEmpType(Object empType) {
		return findByProperty(EMP_TYPE, empType);
	}

	public List findByEmpName(Object empName) {
		return findByProperty(EMP_NAME, empName);
	}

	public List findByEmpPass(Object empPass) {
		return findByProperty(EMP_PASS, empPass);
	}

	public List findByEmpSalary(Object empSalary) {
		return findByProperty(EMP_SALARY, empSalary);
	}

	public List findByDeptName(Object deptName) {
		return findByProperty(DEPT_NAME, deptName);
	}

	public List findAll() {
		log.debug("finding all EmpTable instances");
		try {
			String queryString = "from EmpTable";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public EmpTable merge(EmpTable detachedInstance) {
		log.debug("merging EmpTable instance");
		try {
			EmpTable result = (EmpTable) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(EmpTable instance) {
		log.debug("attaching dirty EmpTable instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EmpTable instance) {
		log.debug("attaching clean EmpTable instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static EmpTableDAO getFromApplicationContext(ApplicationContext ctx) {
		return (EmpTableDAO) ctx.getBean("EmpTableDAO");
	}
}