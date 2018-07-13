package shop;

import java.util.List;

import shop.reply.ErrorReply;
import shop.reply.ListReply;
import shop.reply.MessageReply;
import shop.reply.ProductReply;
import shop.reply.Reply;

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
	// 작업할 창고에 대한 변수
	private GeneralWarehouse warehouse;
	// 작업후 응답에 대한 변수
	private Reply reply;
	
	// 2. 생성자 선언
	public Manager() {
		warehouse = new ArrayWarehouse();
		// 매니저가 창고를 짓는다....?
		// 매니저의 역할이 벗어나는 코드...
		// 논리적으로 맞지 않음
	}
	public Manager(GeneralWarehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	// 접근자 수정자 접근
	public GeneralWarehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(GeneralWarehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	
	// 3. 메소드 선언
	/**
	 * 매니저는 제품 한개를 창고에 등록
	 * @param product
	 */
	public void add (Product product) {
		int addCnt = warehouse.add(product);
		String massage = null;
		
		if (addCnt > 0) {
			// 추가에 성공한 경우
			massage = String.format("제품정보[%s]추가에 성공하였습니다.", product.getProdCode());
			reply = new MessageReply();
			
		}
		else {
			// 추가에 실패한 경우
			massage = String.format("제품정보[%s]추가에 실패하였습니다.", product.getProdCode());
			reply = new ErrorReply();
		}
		reply.reply(massage);
	}
	
	/**
	 * 매니저는 제품 한개에 대한 정보를 수정
	 * @param product
	 */
	public void set(Product product) {
		int setIdx = warehouse.set(product);
		String massage = null;
		
		if (setIdx > -1) {
			// 수정이 성공한 경우
			massage = String.format("제품정보[%s]수정에 성공하였습니다.", product.getProdCode());
			reply = new MessageReply();
			
		}
		else {
			// 수정이 실패한 경우
			massage = String.format("제품정보[%s]수정에 실패하였습니다.", product.getProdCode());
			reply = new ErrorReply();
		}
		reply.reply(massage);
	}
	
	/**
	 * 매니저는 미판매 물건을 창고에서 제거
	 * 이 때, 제거할 제품의 정보는 알고 있어야 한다.
	 * @param product
	 */
	public void remove(Product product) {
		int rmIdx = warehouse.remove(product);
		String massage = null;
		if (rmIdx > -1) {
			// 수정이 성공한 경우
			massage = String.format("제품정보[%s]삭제에 성공하였습니다.", product.getProdCode());
			reply = new MessageReply();
			
		}
		else {
			// 수정이 실패한 경우
			massage = String.format("제품정보[%s]삭제에 실패하였습니다.", product.getProdCode());
			reply = new ErrorReply();
		}
		reply.reply(massage);
	}
	
	/**
	 * 매니저가 창고에서 제품 한개를 출고
	 * @param product
	 * @return
	 */
	public void get(Product product) {
		Product found = warehouse.get(product);
		
		if (found != null) {
			// 찾아올 제품이 존재할 때
			reply = new ProductReply();
			reply.reply(found);
		}
		else {
			reply = new ErrorReply();
			reply.reply("찾는 제품["+product.getProdCode()+ "] 이(가) 없습니다.");
		}
		
	}
	
	/**
	 * 매니저는 현재 창고에 등록되어 있는 전체 제품 목록 정보를 조회
	 * @return
	 */
	public void getAllProducts() {
		List<Product> products = warehouse.getAllProducts();
		Reply reply = new ListReply();
		reply.reply(products);
	}
	
	
	
	
	
}
