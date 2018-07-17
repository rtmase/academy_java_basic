package io.data;
/**
 * 멤버변수에 캡슐화를 적용하여 모든 데이터 필드는 private 으로 선언
 * 
 * @author PC38221
 *
 */
public class Product extends Object{
	// 멤버 변수
	/** 상품 번호 */
	private String prodCode;
	/** 상품 이름 */
	private String prodName;
	/** 가격 */
	private int price;
	/** 재고 수량 */
	private int quantity;
	
	// 생성자
	public Product(){}
	
	public Product(String prodCode){
		this.prodCode = prodCode;
	}
	
	public Product(String prodCode, String prodName){
		this(prodCode);
		this.prodName = prodName;
	}
	
	public Product(String prodCode, String prodName, int price){
		this(prodCode,prodName);
		this.price = price;
	}
	public Product(String prodCode, String prodName, int price, int quantity){
		this(prodCode,prodName,price);
		this.quantity = quantity;
	}

	/** prodCode 의 접근자 */
	public String getProdCode() {
		return this.prodCode;
	}
	
	/** prodCode 의 수정자 */
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	
	/** prodName 의 접근자 */
	public String getProdName() {
		return prodName;
	}
	
	/** prodName 의 수정자 */
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// 메소드 선언
	
	@Override
	public String toString() {
		String strProduct = String.format("상품 번호 : %s | 상품 이름 : %s | 가격 : %,d | 재고 수량 : %d%n",prodCode, prodName, price, quantity);
		
		return strProduct;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodCode == null) ? 0 : prodCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prodCode == null) {
			if (other.prodCode != null)
				return false;
		} else if (!prodCode.equals(other.prodCode))
			return false;
		return true;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
}
