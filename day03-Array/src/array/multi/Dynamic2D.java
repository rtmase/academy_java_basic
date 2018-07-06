package array.multi;
/**
 * 
 * 2차수의 배열은 각각 3,4,1,5 사이로 생성
 * @author PC38221
 *
 */
public class Dynamic2D {
	public static void main(String[] args) {
		int[][] twoDarray;
		int count = 0;
		twoDarray = new int[4][];
		
		twoDarray[0] = new int[3];
		twoDarray[1] = new int[4];
		twoDarray[2] = new int[1];
		twoDarray[3] = new int[5];
		
		// (1) 2차원 배열의 각 칸에 1 ~ 13까지 for 구문 사용해 할당
		for(int i = 0; i< twoDarray.length; i++) {
			for(int j = 0; j< twoDarray[i].length;j++) {
				count++;
				twoDarray[i][j] = count;
				System.out.print(twoDarray[i][j]+" ");
			}
			System.out.println("");
		}
		
		// (2) 할당한 값 확인을 위한 출력
		/* 일반방법
		 * for(int i = 0; i< twoDarray.length; i++) {
			for(int j = 0; j< twoDarray[i].length;j++) {
				System.out.print(twoDarray[i][j]+" ");
			}
			System.out.println("");
		}
		 */
		// (3) foreach 로 출력
		for(int[] outer : twoDarray) {
			for(int in : outer) {
				System.out.printf("%d\t",in);
			}	
			System.out.println();
		}
	}
}
