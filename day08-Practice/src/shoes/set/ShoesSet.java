package shoes.set;

import java.util.HashSet;
import java.util.Set;

public class ShoesSet {
	// 멤버 변수 선언
	private Set<Shoe> shoes;

	// 생성자 선언
	public ShoesSet(){
		shoes = new HashSet<Shoe>();
	}

	/**
	 * @param shoes
	 */
	public ShoesSet(Set<Shoe> shoes) {
		super();
		this.shoes = shoes;
	}

	public Set<Shoe> getShoes() {
		return shoes;
	}

	public void setShoes(Set<Shoe> shoes) {
		this.shoes = shoes;
	}

	//
	public int add(Shoe shoe) {
		int success = 0;

		if(shoes.add(shoe)) {
			success = 1;
		}

		return success;
	}
	
	public int set(Shoe shoe) {
		int success = 0;
		boolean rmsuccess;
		if(rmsuccess = shoes.remove(shoe)) {
			this.add(shoe);
			success = 1;
		}
		
		return success;
	}
	
	public int remove(Shoe shoe) {
		int success = 0;
		
		return success;
	}
	
	private Shoe findProduct(Shoe shoe) {
		Shoe found = null;
		
		for (Shoe shoee: shoes) {
			if (shoee.equals(shoe)) {
				found = shoee;
				break;
			}
		}
		
		return found;
	}
}
