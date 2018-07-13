package shoes.set;
/**
 * 신발의 정보를 저장하는 클래스
 * 
 * -shoeCode : String : 신발 제품코드
 * -shoeName : String : 신발 제품 명
 * -size : int : 신발의 사이즈(한국형 크기 240, 250 등)
 * -price : int : 가격
 * -type : String : 신발의 타입(운동화, 샌들, 구두, 슬리퍼, 부츠 등)
 * -quantity : int : 재고수량
 * 
 * + 기본생성자 / + 생성자 중복정의 할 수 있는 만큼 모두
 * 
 * + 각 필드의 접근자 / 수정자 메소드
 * + shoeCode 기준 equals(), hashCode() 재정의
 * + toString() 재정의
 * @author PC38221
 *
 */
public class Shoe {
	// 멤버 변수 선언
	private String shoeCode;
	private String shoeName;
	private int size;
	private int price;
	private String type;
	private int quantity; 
	
	// 생성자 선언
	public Shoe() {}
	
	public Shoe(String shoeCode) {
		this.shoeCode = shoeCode;
	}
	public Shoe(String shoeCode, String shoeName) {
		this(shoeCode);
		this.shoeName = shoeName;
	}
	
	public Shoe(String shoeCode, String shoeName, int size) {
		this(shoeCode, shoeName);
		this.size = size;
	}
	
	public Shoe(String shoeCode, String shoeName, int size, int price) {
		this(shoeCode, shoeName, size);
		this.price = price;
	}
	public Shoe(String shoeCode, String shoeName, int size, int price, String type) {
		this(shoeCode, shoeName, size, price);
		this.type = type;
	}
	public Shoe(String shoeCode, String shoeName, int size, int price, String type, int quantity) {
		this(shoeCode, shoeName, size, price, type);
		this.quantity = quantity;
		
	// 접근자 수정자 선언
	}
	public String getShoeCode() {
		return shoeCode;
	}
	public void setShoeCode(String shoeCode) {
		this.shoeCode = shoeCode;
	}
	public String getShoeName() {
		return shoeName;
	}
	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "신발 정보 [shoeCode=" + shoeCode + ", shoeName=" + shoeName + ", size=" + size + ", price=" + price
				+ ", type=" + type + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shoeCode == null) ? 0 : shoeCode.hashCode());
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
		Shoe other = (Shoe) obj;
		if (shoeCode == null) {
			if (other.shoeCode != null)
				return false;
		} else if (!shoeCode.equals(other.shoeCode))
			return false;
		return true;
	}
	
	
	
	// 
}
