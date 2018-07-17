package io.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 파일 입력을 받아서 파일로 출력하는 클래스
 * 
 * -- 입력 -- 
 * 1. node stream (문자(reader) 파일 : FileReader)
 * 2. filter stream (reader -> reader : BufferedReader)
 * 3. filter stream 의 메소드 사용 : readLine() 
 * 
 * -- 출력 -- 
 * 4. node stream (문자(writer) 파일 : FileWriter)
 * 5. filter stream (writer -> writer : PrintWriter)
 * 6. write 작업 : filter stream 의 메소드 사용 : println()
 * 
 * -- 정리 --
 * 7. 입력 filter stream 닫기
 * 8. 출력 filter stream 닫기
 * @author PC38221
 *
 */
public class TextFileCopy {
	public static void main(String[] args) throws IOException {
		// 1. input node stream
		FileReader fr = new FileReader("out.txt");
		
		// 2. input filter stream
		BufferedReader br = new BufferedReader(fr);
		
		// 입력 객체 선언 끝
		
		// 4. output node stream
		FileWriter fw = new FileWriter("copied.txt");
		
		// 5. output filter stream
		PrintWriter pw = new PrintWriter(fw);
		
		// 출력 객체 선언 끝
		
		// 3. read 작업
		String input = null;
		
		while((input = br.readLine()) != null) {
			// 6. write 작업
			pw.println();
			// 화면 출력 같이
			System.out.println("Data : " + input);
		}
		
		System.out.println("complete copy");
		
		// 7. input filter stream close
		br.close();
		// 8. output filter stream close
		pw.close();
	}
}
