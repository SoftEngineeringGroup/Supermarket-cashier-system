package hib;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Counter entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see hib.Counter
 * @author MyEclipse Persistence Tools
 */

public class CounterDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(CounterDAO.class);
	// property constants
	public static final String COUNTER_NAME = "counterName";
	public static final String COUNTER_SEX = "counterSex";
	public static final String SALARY = "salary";
	public static final String WORKDAY = "workday";
	public static final String TEL = "tel";

	protected void initDao() {
		// do nothing
	}

	public void save(Counter transientInstance) {
		log.debug("saving Counter instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Counter persistentInstance) {
		log.debug("deleting Counter instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Counter findById(java.lang.String id) {
		log.debug("getting Counter instance with id: " + id);
		try {
			Counter instance = (Counter) getHibernateTemplate().get(
					"hib.Counter", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Counter instance) {
		log.debug("finding Counter instance by example");
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
		log.debug("finding Counter instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Counter as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCounterName(Object counterName) {
		return findByProperty(COUNTER_NAME, counterName);
	}

	public List findByCounterSex(Object counterSex) {
		return findByProperty(COUNTER_SEX, counterSex);
	}

	public List findBySalary(Object salary) {
		return findByProperty(SALARY, salary);
	}

	public List findByWorkday(Object workday) {
		return findByProperty(WORKDAY, workday);
	}

	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	public List findAll() {
		log.debug("finding all Counter instances");
		try {
			String queryString = "from Counter";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Counter merge(Counter detachedInstance) {
		log.debug("merging Counter instance");
		try {
			Counter result = (Counter) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Counter instance) {
		log.debug("attaching dirty Counter instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Counter instance) {
		log.debug("attaching clean Counter instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CounterDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CounterDAO) ctx.getBean("CounterDAO");
	}
}