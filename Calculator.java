public class Calculator{
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println("Calculator Java Program");
		System.out.println("Calculator Java Program hi");
	}

	public static void addition(int number1,int number2)
	{
		System.out.println("Addition:" +(number1+number2));
	}

	
	public static void division(int number1,int number2)
	{
		if(number2!==0)
		System.out.println("Divisor should not be 0";
		else
		System.out.println("Division:" +(number1/number2));
	}


	public static void substraction(int number1,int number2)
	{
		System.out.println("Substraction:" +(number1-number2));
	}

	public static void multiplication(int number1,int number2)
	{
		System.out.println("Multiplication:" +(number1*number2));
	}

}
