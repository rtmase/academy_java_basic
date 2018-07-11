package inheritance.basic.product;

public class Product extends Object{
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
		System.out.printf("상품 번호 : %s | 상품 이름 : %s | 가격 : %d | 재고 수량 : %d%n",prodCode, prodName, price, quantity);
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

	// Object 클래에서 나도 모르는 사이 상속받은
	// toString() 메소드르 재정의 해보자
	// 1. 메소드 헤더가 동일 : 리턴타입 메소드이름 매개변수
	
	@Override
	public String toString() {
		String strProduct = String.format("상품 번호 : %s | 상품 이름 : %s | 가격 : %,d | 재고 수량 : %d%n",prodCode, prodName, price, quantity);
		
		return strProduct;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
