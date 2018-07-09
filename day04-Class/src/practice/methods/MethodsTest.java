package practice.methods;

public class MethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarietyMethods method = new VarietyMethods();
		method.sayHello();
		method.maxims("소크라테스","너 자신을 알라");
		System.out.println("================");
		method.BirthYearMonth("킬리앙 음바페",1998, 12);
		System.out.println("================");
		method.PrintNineNineTable(8);
		System.out.println("================");
		int[] stages = new int[4];
		stages[0] = 2;
		stages[1] = 8;
		stages[2] = 9;
		stages[3] = 11;
		method.PrintNineNineTableArray(stages);
		System.out.println("================");
		double cel = method.FahToCel(100.0);
		System.out.printf("cel = %5.2f%n",cel);
		System.out.println("================");
		String result = method.Calcbmi(172, 88);
		System.out.println(result);
		System.out.println("================");
		int min = method.Min(100, -100);
		System.out.println(min);
		System.out.println("================");
		int max = method.Max(100, -100);
		System.out.println(max);
		System.out.println("================");
		int[] numbers = new int[4];
		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;
		numbers[3] = 400;
		int sum = method.SumOfArray(numbers);
		System.out.println("합 : "+sum);
		System.out.println("================");
		double avg = method.AvgOfArray(numbers);
		System.out.println("평균 : "+ avg);
		System.out.println("================");
		method.Adder('+', 100, 90);
	}

}
