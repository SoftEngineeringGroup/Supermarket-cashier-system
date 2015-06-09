package hib;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import service.ISalegoodsDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Salegoods entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see hib.Salegoods
 * @author MyEclipse Persistence Tools
 */

public class SalegoodsDAO extends HibernateDaoSupport implements ISalegoodsDAO {
	private static final Logger log = LoggerFactory
			.getLogger(SalegoodsDAO.class);
	// property constants
	public static final String GOODS_NAME = "goodsName";
	public static final String SALE_QUANTITY = "saleQuantity";
	public static final String TOTAL = "total";
	public static final String CURRENT_QUANTITY = "currentQuantity";
	public static final String SUM_PRICE = "sumPrice";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see hib.ISalegoodsDAO#save(hib.Salegoods)
	 */
	@Override
	public void save(Salegoods transientInstance) {
		log.debug("saving Salegoods instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see hib.ISalegoodsDAO#delete(hib.Salegoods)
	 */
	@Override
	public void delete(Salegoods persistentInstance) {
		log.debug("deleting Salegoods instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see hib.ISalegoodsDAO#findById(java.lang.Integer)
	 */
	@Override
	public Salegoods findById(java.lang.Integer id) {
		log.debug("getting Salegoods instance with id: " + id);
		try {
			Salegoods instance = (Salegoods) getHibernateTemplate().get(
					"hib.Salegoods", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Salegoods instance) {
		log.debug("finding Salegoods instance by example");
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
		log.debug("finding Salegoods instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Salegoods as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGoodsName(Object goodsName) {
		return findByProperty(GOODS_NAME, goodsName);
	}

	public List findBySaleQuantity(Object saleQuantity) {
		return findByProperty(SALE_QUANTITY, saleQuantity);
	}

	public List findByTotal(Object total) {
		return findByProperty(TOTAL, total);
	}

	public List findByCurrentQuantity(Object currentQuantity) {
		return findByProperty(CURRENT_QUANTITY, currentQuantity);
	}

	public List findBySumPrice(Object sumPrice) {
		return findByProperty(SUM_PRICE, sumPrice);
	}

	/* (non-Javadoc)
	 * @see hib.ISalegoodsDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Salegoods instances");
		try {
			String queryString = "from Salegoods";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Salegoods merge(Salegoods detachedInstance) {
		log.debug("merging Salegoods instance");
		try {
			Salegoods result = (Salegoods) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Salegoods instance) {
		log.debug("attaching dirty Salegoods instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Salegoods instance) {
		log.debug("attaching clean Salegoods instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ISalegoodsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ISalegoodsDAO) ctx.getBean("SalegoodsDAO");
	}
}