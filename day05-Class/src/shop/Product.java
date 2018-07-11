package shop;
/**
 * 입력된 퍼센트만큼 할인가격 리턴
 * 매장에서 판매되어 재고수량이 줄어듬
 * 매장에 입고되어 재고수량이 늘어남
 * 
 * set(String prodCode, String prodName, int price, int quantity)
 * @author PC38221
 *
 */
public class Product {
	/** 상품 번호 */
	String prodCode;
	/** 상품 이름 */
	String prodName;
	/** 가격 */
	int price;
	/** 재고 수량 */
	int quantity;
	
	//생성자
	Product(){}
	
	Product(String prodCode){
		this.prodCode = prodCode;
	}
	
	Product(String prodCode, String prodName){
		this(prodCode);
		this.prodName = prodName;
	}
	
	Product(String prodCode, String prodName, int price){
		this(prodCode,prodName);
		this.price = price;
	}
	Product(String prodCode, String prodName, int price, int quantity){
		this(prodCode,prodName,price);
		this.quantity = quantity;
	}
	
	/**
	 * 상태를 출력
	 */
	public void print() {
		System.out.printf("상품 번호 : %s | 상품 이름 : %s | 가격 : %,6d | 재고 수량 : %2d%n",prodCode, prodName, price, quantity);
	}
	
	/**
	 * 할인율을  받아 할인된 가격을 리턴
	 * @param percent
	 * @return
	 */
	public int discount(int percent) {
		if(percent > 0)
			price = price - (int)(this.price * ( (double)percent / 100 ));

		return price;
	}
	
	/**
	 * 판매되고 남은 재고 수량
	 * @param amount
	 */
	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을 때만 출고함.
		if(quantity - 1 >= amount)
			quantity -= amount;
	}
	
	/**
	 * 입고된 재고 수량
	 * @param amount
	 */
	public void buy(int amount) {
		quantity += amount;
	}
	/**
	 * 입력된 값으로 제품 정보를 수정하여 저장
	 * @param prodCode
	 * @param prodName
	 * @param price
	 * @param quantity
	 */
	public void set(String prodCode, String prodName, int price, int quantity) {
		if(!this.prodCode.equals(prodCode)) {
			this.prodCode = prodCode;
		}
		
		if(!this.prodName.equals(prodName)) {
			this.prodName = prodName;
		}
		
		if(this.price != price) {
			this.price = price;
		}
		
		if(this.quantity != quantity) {
			this.quantity = quantity;
		}
	}
}
