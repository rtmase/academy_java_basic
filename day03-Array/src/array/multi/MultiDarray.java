package array.multi;

public class MultiDarray {
	public static void main(String[] args) {
		char stars[][];
		
		stars = new char[6][];
		
		stars[0] = new char[1];
		stars[1] = new char[2];
		stars[2] = new char[3];
		stars[3] = new char[4];
		stars[4] = new char[5];
		stars[5] = new char[6];
		
		for(int i = 0; i < stars.length; i++) {
			for(int j = 0; j < stars[i].length; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
