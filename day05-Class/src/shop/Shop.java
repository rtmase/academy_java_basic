package shop;
/**
 * 물건을 판매하는 매장을 나타내는 클래스
 * 매장에는 물건 판매를 위하여 최소 1명의 매니저는 있어야 한다.
 * @author PC38221
 *
 */
public class Shop {
	// 1. 멤버 변수 선언 : 매장을 관리할 매니저 최소 1명
	Manager manager;
	
	// 2. 생성자 선언
	Shop() {
		manager = new Manager();
	}
	
	Shop(Manager manager){
		this.manager = manager;
	}
	
	// 3. 메소드 선언
	/**
	 * 매장에 신규 제품이 들어 왔을 경우 
	 * 매니저에게 부탁해 새 제품을 창고에 등록 부탁
	 * @param product
	 */
	public void add(Product product) {
		manager.add(product);
	}
	
	/**
	 * 매장에 판매중인 제품 정보에 수정이 필요할 때
	 * 매니저에게 제품 정보 수정을 부탁
	 * @param product
	 */
	public void set(Product product) {
		manager.set(product);
	}
	
	/**
	 * 매장에서 더 이상 판매하지 않을 물건의 폐기를 매니저에게 부탁
	 * @param product
	 */
	public void remove(Product product) {
		manager.remove(product);
	}
	
	/**
	 * 매장에 찾아온 고객에게 판매할 물건을 창고에서 가져다 달라고 부탁
	 * @param product
	 * @return
	 */
	public Product get(Product product) {
		return manager.get(product);
	}
	
	/**
	 * 매장에서 판매될 수 있는 모든 제품의 정보를 매니저에게 부탁
	 * @return
	 */
	public Product[] getAllProducts() {
		return manager.getAllProducts();
	}
	
}
