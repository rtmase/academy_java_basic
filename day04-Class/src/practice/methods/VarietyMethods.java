package practice.methods;
/**
 * 메소드 작성 실습 클래스
 * @author PC38221
 *
 */
public class VarietyMethods {
	/*
	 * 화면에 hello,world 를 출력하는 메소드
	 */
	public void sayHello() {
		System.out.println("hello, world!");
	}
	/*
	 * 매개변수로 유명인 의 이름(name)을 입력 받고 
	 * 그 사람이 한 유명한 문구(maxim)를 입력 받아
	 * 
	 * 000(이)가 말하길 "...."라고 하였다.
	 * 라는 문장을 출력하는 메소드maxims를 정의하라.
	 */
	public void maxims (String name,String maxim) {
		System.out.printf("%s (이)가 말하길 \" %s \" \n",name,maxim);
	}
	/*
	 * 어떤 사람의 이름, 생년, 출생월을 매개변수로 입력받아
	 * 000는 xxxx년 xx월 생입니다.
	 * 
	 * 라는 문장으로 출력하는 메소드
	 * birthYearMonth 라는 메소드 디자인
	 * name : String
	 * year : int
	 * month: int
	 */
	public void BirthYearMonth (String name,int year,int month) {
		System.out.printf("%s 는 %d 년 %d 월 생입니다.%n",name,year,month);
	}
	 /*
	  * 출력할 단의 숫자를 입력받아
	  * 해당 단의 구구단을 출력하는 메소드
	  * 출력의 첫 줄에 X 단 이라는 제목을 출력
	  * PrintNineNineTable 을 디자인
	  *
	  * stage : int
	  * 
	  */
	public void PrintNineNineTable (int stage) {
		int i;
		
		for (i=1;i<10;i++) {
			System.out.printf("%d x %d = %d%n",stage, i, stage*i);
		}
	}
	/*
	 * 출력할 단의 숫자를 가지고 있는 int 배열을 매개변수로 입력받아
	 * 입력된 배열의 원소인 각 숫자에 대해 구구단을 출력하는 메소드
	 * PrintNineNineTableArray 를 디자인
	 * 
	 * stages : int 배열
	 */
	public void PrintNineNineTableArray(int[] stages) {
		int i,j;
		
		for (i=0;i<stages.length;i++) {
			for (j=1;j<10;j++) {
				System.out.printf("%d x %d = %d%n",stages[i],j,stages[i]*j);
			}
			System.out.println("");
		}
	}
	/*
	 * 입력된 화씨온드를 섭씨온도로 변환하여 변환된 섭씨온도를 리턴하는 메소드
	 * FahToCel 을 디자인
	 * 
	 * fah : double
	 * 변환된 섭씨 온도 값
	 */
	public double FahToCel (double fah) {
		double cel = 0;
		
		cel = (double)5/9 * (fah - 32);
		
		return cel;
	}
	/*
	 * 키(cm), 몸무게(kg)를 매개변수로 입력받아 bmi 지수를 계산하여 
	 * 비만도 판정 결과를 리턴하는 메소드
	 * Calcbmi 디자인
	 * 
	 * 15.0			병적인 저체중
	 * 15.0~18.5	저체중
	 * 18.5~23.0	정상
	 * 23.0~27.5	과체중
	 * 27.5~40.0	비만
	 * 40			병적인 비만
	 * 
	 * height : double
	 * weight : dobule
	 * 비만도 판정 결과 문자열
	 */
	public String Calcbmi (double height,double weight) {
		double bmi,meter;
		meter = height/100;
		bmi = weight/(meter*meter);
		String verdict = null;
		
		if(bmi<15.0) {
			verdict="병적인 저체중";
		}
		else if(bmi>=15.0 && bmi<18.5) {
			verdict="저체중";
		}
		else if(bmi>=18.5 && bmi<23.0) {
			verdict="정상";
		}
		else if(bmi>=23.0 && bmi<27.5) {
			verdict="과체중";
		}
		else if(bmi>=27.5 && bmi<40.0) {
			verdict="비만";
		}
		else if(bmi>=40.0) {
			verdict="병적인 비만";
		}
		
		return verdict;
	}
	/*
	 * 입력된 두정수 중에서 작은 수를 찾아 리턴하는 메소드
	 * Min을 디자인
	 * 
	 * input1
	 * input2
	 * 둘중 작은 정수
	 */
	public int Min(int input1,int input2) {
		int min=0;
		
		if(input1>input2) {
			min = input2;
		}
		else {
			min = input1;
		}
		
		return min;
	}
	/*
	 * 입력된 두 정수 중에서 큰 수를 찾아 리턴하는 메소드
	 * Max를 디자인
	 * 
	 * input1
	 * input2
	 * 둘중 큰 정수
	 * 
	 */
	public int Max(int input1,int input2) {
		int max=0;
		
		if(input1>input2) {
			max = input1;
		}
		else {
			max = input2;
		}
		
		return max;
	}
	/*
	 * 정수가 저장된 int 배열을 매개변수로 입력받아 
	 * 그 배열의 각 원소의 합을 구하여 리턴하는 메소드
	 * SumOfArray 를 디자인
	 * 
	 * numbers : int 배열
	 * numbers 배열의 각 원소의 합
	 */
	public int SumOfArray(int[] numbers) {
		int i,sum = 0;
		
		for (i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		
		return sum;
	}
	/*
	 * 정수가 저장된 int 배열을 매개변수로 입력받아
	 * 그 배열의 각 원소들의 평균을 구하여 리턴하는 메소드
	 * AvgOfArray 를 디자인
	 * 
	 * numbers
	 * numbers 배열의 각 원소의 평균
	 * 
	 */
	public double AvgOfArray(int[] numbers) {
		int i,sum = 0;
		double avg;
		
		for (i=0;i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		avg = (double)sum / (numbers.length);
		
		return avg;
	}
	/*
	 * char 타입의 연산자와 두 개의 정수를 매개변수로 입력받아
	 * 입력된 연산자가 + 일 때만 두 정수의 합을 구하여 덧셈의 결과를 출력하는 메소드
	 * Adder 를 디자인
	 * op : char
	 * x : int
	 * y : int
	 */
	public void Adder(char op,int x, int y) {
		if(op == '+') {
			System.out.printf("%d + %d = %d %n",x,y,x+y);
		}
		else {
			System.out.println(" + 를 사용하세요");
		}
	}
	
}
