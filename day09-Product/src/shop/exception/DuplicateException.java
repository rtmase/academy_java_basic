package shop.exception;

import shop.vo.Product;

/**
 * 신규 입력 할 때 제품 정보가 중복상태인 경우
 * 발생시킬 예외를 정의한 클래스
 * @author PC38221
 *
 */
public class DuplicateException extends Exception {
	
	// 기본 생성자
	public DuplicateException() {
		super("제품 정보가 중복되었습니다.");
	}
	
	public DuplicateException(String type, Product product) {
		super(String.format("%s:[%s] 제품 정보가 중복되었습니다.",type,product.getProdCode()));
	}
	
}
