package practice.methods;

import java.util.Scanner;

public class DefineMethodsTest {
	public static void main(String[] args) {
		DefineMethods dfm = new DefineMethods();
		Scanner scan = new Scanner(System.in);
		int number,number1,add,sub,abs_x;
		int[] numbers;
		double dnumber,dnumber1,dmul,dsub,dadd,dresult,area;
		String name,message,fullname,surname,operator,decidesign;
		boolean bul;


		// 1.
		System.out.println("정수를 입력하세요");
		number = scan.nextInt();
		dfm.printTentimes(number);

		// 2.
		System.out.println("이름을 입력하세요");
		name = scan.next();
		System.out.println("메시지를 입력하세요");
		message = scan.next();
		dfm.printSomebodysMessage(message, name);

		// 3.
		System.out.println("메시지를 입력하세요");
		message = scan.next();
		dfm.printMessage(message);

		// 4.
		System.out.println("메시지를 입력하세요");
		message = scan.next();
		message = dfm.returnOriginMessage(message);
		System.out.println(message);

		// 5.
		System.out.println("정수를 입력하세요");
		number = scan.nextInt();
		add = dfm.addTen(number);
		System.out.println(add);

		// 6.
		System.out.println("정수를 입력하세요");
		number = scan.nextInt();
		sub = dfm.subtractTen(number);
		System.out.println(sub);

		// 7.
		System.out.println("실수를 입력하세요");
		dnumber1 = scan.nextDouble();
		dmul = dfm.makeDouble(dnumber1);
		System.out.println(dmul);

		// 8.
		System.out.println("실수를 입력하세요");
		dnumber1 = scan.nextDouble();
		dsub = dfm.subtractFivePointFive(dnumber1);
		System.out.println(dsub);

		// 9.
		System.out.println("이름을 입력하세요");
		name = scan.next();
		System.out.println("성을 입력하세요");
		surname = scan.next();
		fullname = dfm.makeFullName(name, surname);
		System.out.println(fullname);

		// 10.
		System.out.println("두개의 정수를 입력하세요");
		number = scan.nextInt();
		number1 = scan.nextInt();
		add = dfm.add(number, number1);
		System.out.println(add);

		// 11.
		System.out.println("두개의 실수를 입력하세요");
		dnumber = scan.nextDouble();
		dnumber1 = scan.nextDouble();
		dadd = dfm.add(dnumber, dnumber1);
		System.out.println(dadd);
		// 12.
		System.out.println("메시지와 정수를 입력하세요");
		message = scan.next();
		number = scan.nextInt();
		dfm.printMsgManyTimes(message, number);

		// 13.
		System.out.println("두 정수와 사칙연산(+,-,*,/) 을 입력하세요");
		number = scan.nextInt();
		number1 = scan.nextInt();
		operator = scan.next();
		dfm.arithmetic(number, number1, operator);

		// 14.
		System.out.println("두 실수와 사칙연산(+,-,*,/) 을 입력하세요");
		dnumber = scan.nextDouble();
		dnumber1 = scan.nextDouble();
		operator = scan.next();
		dresult = dfm.arithmetic(dnumber, dnumber1, operator);
		System.out.printf("%5.2f %s %5.2f = %5.2f%n",dnumber,operator,dnumber1,dresult);


		// 15.
		System.out.println("정수를 입력하세요");
		number = scan.nextInt();
		bul = dfm.isEven(number);
		System.out.println(bul);

		// 1.
		System.out.println("정수를 입력하세요");
		number = scan.nextInt();
		abs_x = dfm.abslute(number);
		System.out.println(abs_x);

		// 2.
		System.out.println("정수를 입력하세요");
		number = scan.nextInt();
		dfm.findMultiple(number);

		// 3.
		System.out.println("정수를 입력하세요");
		number = scan.nextInt();
		decidesign = dfm.decideSign(number);
		System.out.println(decidesign);
		// 4.
		System.out.println("메시지와 정수를 입력하세요");
		message = scan.next();
		number = scan.nextInt();
		dfm.repeatedMessage(message, number);

		// 5.		
		System.out.println("정수를 입력하세요");
		number = scan.nextInt();
		area = dfm.calcCircleArea(number);
		System.out.println(area);
		// 6.
		System.out.println("정수를 입력하세요");
		number = scan.nextInt();
		numbers = dfm.makeMultipleNums(number);
		for(int i = 0; i< numbers.length;i++) {
			System.out.println(numbers[i]);
		}
	}
}
