package array.swap;
/**
 * 두 변수의 값을 서로 맞바꾸는 swap 기법을 적용하여
 * 배열의 순서를 뒤집어보는 클래스
 * @author PC38221
 *
 */
public class SwapArray {
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40,50,60,70,80,90,100,110,120};
		
		/*
		 * 배열을 뒤집는 로직의 구성
		 * 
		 * 1. 전체 배열의 끝까지 순회를 하면
		 *    배열이 두 번 뒤집어져 값의 변화가 없다.
		 *    
		 * 2. 배열의 순서를 뒤집기 위해서는
		 * 	  길이의 반만 작업을 수행해야 함.
		 * 
		 * 0 : 11 	: length - 1 - i
		 * 1 : 10   : 
		 * 2 : 9
		 * 3 : 8
		 * 4 : 7
		 * 5 : 6
		 * 
		 * 0 ~ 5 까지의 인덱스 값은 numbers.length/2 보다 작은 동안
		 * 0 < i < numbers.length/2 
		 * 맞바꿀 원소의 인덱스 : length - 1 -i
		 */
		for(int i = 0; i < numbers.length/2; i++ ) {
			int temp;
			temp = numbers[i];
			numbers[i] = numbers[numbers.length-1-i];
			numbers[numbers.length-1-i] = temp;
		}
		for(int i =0; i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		
	}
}
