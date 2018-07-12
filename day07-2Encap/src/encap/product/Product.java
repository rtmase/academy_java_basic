package encap.product;
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
	
	// -----------------------------
	// 멤버 변수 필드의 가시성을 private 으로 선언하면 
	// 다른 모든 클래스에서 접근이 불가능
	// 따라서, 숨겨진 피들에 접근할 수 있는 전용 메소드 쌍을 정의해야 한다.
	// =============================
	// 접근자 메소드 : getter
	// 1. get 으로 시작
	// 2. get 뒤에 오는이름은 접근하려는 멤버변수 명의 첫 글자만 대문자화 하여 정의한다.
	// 3. 메소드 매개변수가 없다.
	// 4. 메소드 리턴 타입을 접근하려는 멤버변수 타입과 맞춘다.
	// 5. 멤버변수의 타입이 boolean 이면 메소드 이름이 is 로 시작하도록 작성
	// 6. getXxx(), isXxx() 형태로 정의
	// ------------------------------
	// 수정자 메소드 : setter
	// 1. set 으로 시작
	// 2. set 뒤에 오는 이름은 수정하려는 멤버변수 명의 첫 글자만 대문자화하여 정의한다.
	// 3. 메소드 매개 변수는 수정하려는 멤버변수의 타입과 맞추고, 보통 같은 이름으로 설정
	// 4. 리턴 타입은 void 로 한다.
	// 5. 보통 안쪽의 로직은 this.멤버변수 = 매개변수; 작성
	
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
		int result = 0;
		if(percent > 0)
			result = price - (int)(this.price * ( (double)percent / 100 ));

		return result;
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
