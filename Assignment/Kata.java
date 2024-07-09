import java.util.Scanner;
public class Kata{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number to check if it is even number: ");
	int number = input.nextInt();
	
	boolean evenNumber = kataFunction.evenNumber(number);
	System.out.println(evenNumber);
	
	
	System.out.print("Enter a number to check if it is a prime number: ");
	number = input.nextInt();
	
	boolean isPrime = kataFunction.isPrime(number);
	System.out.println(isPrime);


	System.out.print("Enter a number to subtract from: ");
	int number1 = input.nextInt();
	
	System.out.print("Enter second number: ");
	int number2 = input.nextInt();
	
	int result = kataFunction.subtract(number1, number2);
	System.out.println(result);

	System.out.print("Enter a number to divide: ");
	float num1 = input.nextFloat();
	
	System.out.print("Enter second number to divide with: ");
	float num2 = input.nextFloat();
	
	float rResult = kataFunction.division(num1, num2);
	System.out.printf("%.2f",rResult);


	System.out.print("/nEnter a number to factorise: ");
	int newNumber = input.nextInt();
	
	int numberOfFactors = kataFunction.factor(newNumber);
	System.out.println("The number of factor is " +numberOfFactors);

	System.out.print("Enter a five digit number to determine palindrome: ");
	number = input.nextInt();

	boolean palindrome = kataFunction.palindrome(number);
	System.out.printf("%b this %d is (not) a palindrome .", palindrome, number);

	System.out.println("\nEnter a number to calculate factorial: ");
	number = input.nextInt();

	long factorial = kataFunction.factorial(number);
	System.out.println(" The factorial is " +factorial);

	System.out.print("Enter a number to determine if it is a perfect square: ");
	number = input.nextInt();

	boolean isSquare = kataFunction.isSquare(number);
	System.out.print(isSquare);
	
}
}