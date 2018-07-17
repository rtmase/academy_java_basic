package io.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 파일로 입력을 받아서 표준 출력(콘솔창) 출력을 하는 클래스
 * 
 * -- 입력 --
 * 1. node stream ( 파일(문자 파일) : reader) : FileReader)
 * 2. filter stream (reader -> reader : BufferedReader)
 * 3. filter stream 메소드 사용 : readLine()
 * 
 * -- 출력 --
 * 4. node stream ( 표준 출력 : System.out : PrintStream)
 * 5. 1줄 출력 : println() 메소드 사용
 * 
 * -- 정리 --
 * 6. 입력 filter stream 닫기
 * @author PC38221
 *
 */
public class FileInput {
	public static void main(String[] args) throws IOException {
		// 1. 
		FileReader fr = new FileReader("out.txt");
		
		// 2.
		BufferedReader br = new BufferedReader(fr);
		
		// 3.
		String input = null;
		
		while((input = br.readLine()) != null) {
			// 4. 5.
			System.out.println("Date : " + input);
		}
		
		// 6. 
		br.close();
	}
}
