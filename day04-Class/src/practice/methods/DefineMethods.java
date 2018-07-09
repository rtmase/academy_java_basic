package practice.methods;

public class DefineMethods {
	//1.
	public void printTentimes(int input){
		int i,sum=0;
		sum= input;
		for(i=0;i<10;i++){
			System.out.println(sum);
		sum=sum+10;
		}
	}

	//2.
	public void printSomebodysMessage(String message,String name){
		System.out.printf("%s의 메시지: %s%n",name,message);
	}

	//3.
	public void printMessage(String message){
		System.out.println(message);
	}

	//4.
	public String returnOriginMessage(String message){
		return message;
	}


	//5.
	public int addTen(int input){
		input += 10;
		return input;
	}

	//6.
	public int subtractTen(int input){
		input -= 10;
		return input;
	}

	//7.
	public double makeDouble(double input){
		input = input * 2;
		return input;
	}

	//8.
	public double subtractFivePointFive(double input){
		input = input - 5.5;
		return input;
	}

	//9.
	public String makeFullName(String name,String surname){
		String fullname;
		fullname = name + surname;
		return fullname;
	}

	//10.
	public int add(int x , int y){
		int add;
		add= x + y;
		return add;
	}

	//11.
	public double add(double x, double y){
		double add;
		add = x + y;
		return add;
	}

	//12.
	public void printMsgManyTimes(String message,int input){
		int i;
		for(i=0;i<input;i++){
		System.out.println(message);
		}
	}

	//13.
	public void arithmetic(int x, int y, String operator){
		int result = 0;
		if(operator.equals("+"))
			result = x + y;
		else if(operator.equals("-"))
			result = x - y;
		else if(operator.equals("*"))
			result = x * y;
		else if(operator.equals("/"))
			result = x / y;
		else
			System.err.println("error");
		
		System.out.printf("%d %s %d = %d%n",x,operator,y,result);
	}

	//14.
	public double arithmetic(double x, double y, String operator){
		double result = 0;
		if(operator.equals("+"))
			result = x + y;
		else if(operator.equals("-"))
			result = x - y;
		else if(operator.equals("*"))
			result = x * y;
		else if(operator.equals("/"))
			result = x / y;
		else
			System.err.println("error");
		return result;
	}

	//15.
	public boolean isEven(int input){
		if(input%2==0)
		return true;
		else
		return false;
	}

	//1.
	public int abslute(int x){
		if(x<0)
			x = -x;
		else
			x = x;
		return x;
	}

	//2.
	public void findMultiple(int x){
		int i;
		for(i=1;i<100;i++){
		if(x*i<100)
		System.out.println(x*i);
		}
	}

	//3.
	public String decideSign (int x){
		String str;
		if(x>0)
		str = "양의 정수";
		else if(x==0)
		str = "정수 0";
		else
		str = "음의 정수";

		return str;
	}

	//4.
	public void repeatedMessage(String message,int repeat){
		String[] str = new String[repeat];
		int i;
		for(i=0;i<str.length;i++){
			str[i]=message;
		}
		for(i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
		
	}

	//5.
	public double calcCircleArea (int r){
		double won;
		won = 3.14 *r *r;
		return won;
	}

	//6.
	public int[] makeMultipleNums (int x){
		int lengths, i;
		lengths = 100/ x;
		int[] numbers = new int[lengths];
		for(i=1;i<numbers.length;i++){
			if(x*i<100)
			numbers[i] = x * i;
		}
		return numbers;
	}
}
