package hib;

/**
 * Client entity. @author MyEclipse Persistence Tools
 */

public class Client implements java.io.Serializable {

	// Fields

	private Integer tradeId;
	private Integer goodsId;
	private Double price;
	private Integer saleQuantity;
	private Double totalPrice;
	private String buyDate;
	private String counterId;
	private String memberId;

	// Constructors

	/** default constructor */
	public Client() {
	}

	/** minimal constructor */
	public Client(Double price) {
		this.price = price;
	}

	/** full constructor */
	public Client(Integer goodsId, Double price, Integer saleQuantity,
			Double totalPrice, String buyDate, String counterId, String memberId) {
		this.goodsId = goodsId;
		this.price = price;
		this.saleQuantity = saleQuantity;
		this.totalPrice = totalPrice;
		this.buyDate = buyDate;
		this.counterId = counterId;
		this.memberId = memberId;
	}

	// Property accessors

	public Integer getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getSaleQuantity() {
		return this.saleQuantity;
	}

	public void setSaleQuantity(Integer saleQuantity) {
		this.saleQuantity = saleQuantity;
	}

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getBuyDate() {
		return this.buyDate;
	}

	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

	public String getCounterId() {
		return this.counterId;
	}

	public void setCounterId(String counterId) {
		this.counterId = counterId;
	}

	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

}