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
 * AppTable entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see hib.AppTable
 * @author MyEclipse Persistence Tools
 */

public class AppTableDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(AppTableDAO.class);
	// property constants
	public static final String APP_REASON = "appReason";
	public static final String APP_RESULT = "appResult";

	protected void initDao() {
		// do nothing
	}

	public void save(AppTable transientInstance) {
		log.debug("saving AppTable instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AppTable persistentInstance) {
		log.debug("deleting AppTable instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AppTable findById(java.lang.Integer id) {
		log.debug("getting AppTable instance with id: " + id);
		try {
			AppTable instance = (AppTable) getHibernateTemplate().get(
					"hib.AppTable", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AppTable instance) {
		log.debug("finding AppTable instance by example");
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
		log.debug("finding AppTable instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AppTable as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAppReason(Object appReason) {
		return findByProperty(APP_REASON, appReason);
	}

	public List findByAppResult(Object appResult) {
		return findByProperty(APP_RESULT, appResult);
	}

	public List findAll() {
		log.debug("finding all AppTable instances");
		try {
			String queryString = "from AppTable";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AppTable merge(AppTable detachedInstance) {
		log.debug("merging AppTable instance");
		try {
			AppTable result = (AppTable) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AppTable instance) {
		log.debug("attaching dirty AppTable instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AppTable instance) {
		log.debug("attaching clean AppTable instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AppTableDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AppTableDAO) ctx.getBean("AppTableDAO");
	}
}