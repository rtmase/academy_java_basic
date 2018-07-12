package encap.shop;
/**
 * 창고(Warehouse)를 사용하는 매장 매니저를 나타내는 클래스
 * 
 * 매장 매니저는
 * 1. 제품을 창고에 등록
 * 2. 창고에서 출고
 * 3. 수량, 가격정보 수정
 * 4. 미판매 풀품 폐기
 * 등의 작업을 창고에서 진행
 * 
 * 전제 조건 : 매니저는 우리 매장의 창고가 어디 있는지 알고 있어야 함
 * @author PC38221
 *
 */
public class Manager {
	// 1. 멤버변수 선언
	private Warehouse warehouse;
	
	// 2. 생성자 선언
	Manager() {
		warehouse = new Warehouse();
		// 매니저가 창고를 짓는다....?
		// 매니저의 역할이 벗어나는 코드...
		// 논리적으로 맞지 않음
	}
	Manager(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	// 접근자 수정자 접근
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	
	// 3. 메소드 선언
	/**
	 * 매니저는 제품 한개를 창고에 등록
	 * @param product
	 */
	public void add (Product product) {
		warehouse.add(product);
	}
	
	/**
	 * 매니저는 제품 한개에 대한 정보를 수정
	 * @param product
	 */
	public void set(Product product) {
		warehouse.set(product);
	}
	
	/**
	 * 매니저는 미판매 물건을 창고에서 제거
	 * 이 때, 제거할 제품의 정보는 알고 있어야 한다.
	 * @param product
	 */
	public void remove(Product product) {
		warehouse.remove(product);
	}
	
	/**
	 * 매니저가 창고에서 제품 한개를 출고
	 * @param product
	 * @return
	 */
	public Product get(Product product) {
		return warehouse.get(product);
	}
	
	/**
	 * 매니저는 현재 창고에 등록되어 있는 전체 제품 목록 정보를 조회
	 * @return
	 */
	public Product[] getAllProducts() {
		return warehouse.getAllProducts();
	}
	
	
	
	
	
}
