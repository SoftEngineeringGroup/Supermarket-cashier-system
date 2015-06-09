package hib;

/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods implements java.io.Serializable {

	// Fields

	private Integer goodsId;
	private String goodsName;
	private Double price;
	private Double memberPrice;
	private Integer total;
	private Integer currentQuantity;

	// Constructors

	/** default constructor */
	public Goods() {
	}

	/** minimal constructor */
	public Goods(Double price, Double memberPrice) {
		this.price = price;
		this.memberPrice = memberPrice;
	}

	/** full constructor */
	public Goods(String goodsName, Double price, Double memberPrice,
			Integer total, Integer currentQuantity) {
		this.goodsName = goodsName;
		this.price = price;
		this.memberPrice = memberPrice;
		this.total = total;
		this.currentQuantity = currentQuantity;
	}

	// Property accessors

	public Integer getGoodsId() {
		System.out.println(this.goodsId);
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

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getMemberPrice() {
		return this.memberPrice;
	}

	public void setMemberPrice(Double memberPrice) {
		this.memberPrice = memberPrice;
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

}