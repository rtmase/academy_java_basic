package shoes.list;

import java.util.ArrayList;
import java.util.List;

public class ShoeList {
	// 멤버 변수 선언
	private List<Shoe> shoes;
	
	// 생성자 선언
	public ShoeList() {
		shoes = new ArrayList<Shoe>();
	}

	/**
	 * @param shoes
	 */
	public ShoeList(List<Shoe> shoes) {
		this.shoes = shoes;
	}

	// 접근자 수정자 선언
	public List<Shoe> getShoes() {
		return shoes;
	}

	public void setShoes(List<Shoe> shoes) {
		this.shoes = shoes;
	}
	
	public int add(Shoe shoe) {
		int success = 0;
		if(shoes.add(shoe)) {
			success = 1;
		}
		return success;
	}
	
	public int set(Shoe shoe) {
		int success = 0;
		int idx = findShoeIdx(shoe);
		if (idx > -1) {
			shoes.set(idx, shoe);
			success = 1;
		}
		
		return success;
	}
	
	public int remove(Shoe shoe) {
		int success = 0;
		int idx = findShoeIdx(shoe);
		if (idx > -1) {
			shoes.remove(idx);
			success = 1;
		}
		
		return success;
	}
	
	public Shoe get(Shoe shoe) {
		Shoe found = null;
		int idx = findShoeIdx(shoe);
		
		found = shoes.get(idx);
		
		return found;
	}
	
	private int findShoeIdx(Shoe shoe) {
		int index = -1;
		
		for (int idx = 0; idx < shoe.getSize(); idx++) {
			if(shoes.get(idx).equals(shoe)) {
				index = idx;
			}
		}
		
		return index;
	}
}
