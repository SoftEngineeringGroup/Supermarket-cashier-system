package hib;

/**
 * Salegoods entity. @author MyEclipse Persistence Tools
 */

public class Salegoods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private String goodsName;
	private Integer saleQuantity;
	private Integer total;
	private Integer currentQuantity;
	private Double sumPrice;

	// Constructors

	/** default constructor */
	public Salegoods() {
	}

	/** full constructor */
	public Salegoods(String goodsName, Integer saleQuantity, Integer total,
			Integer currentQuantity, Double sumPrice) {
		this.goodsName = goodsName;
		this.saleQuantity = saleQuantity;
		this.total = total;
		this.currentQuantity = currentQuantity;
		this.sumPrice = sumPrice;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public Integer getSaleQuantity() {
		return this.saleQuantity;
	}

	public void setSaleQuantity(Integer saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getCurrentQuantity() {
		return this.currentQuantity;
	}

	public void setCurrentQuantity(Integer currentQuantity) {
		this.currentQuantity = currentQuantity;
	}

	public Double getSumPrice() {
		return this.sumPrice;
	}

	public void setSumPrice(Double sumPrice) {
		this.sumPrice = sumPrice;
	}

}