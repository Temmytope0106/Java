public class kataFunction{

	public static boolean evenNumber(int number){

	if(number % 2 == 0) return true;
	return false;
	}

	

	public static boolean isPrime(int number){
	
	int counter = 0;
	for(int multiple = 2; multiple <= number; multiple++){

	if( number % multiple == 0) counter++;
	
	}
	if(counter == 1) return true;
	return false;
	}

	
	public static int subtract(int number1, int number2){

	int result = 0;
	if(number1 > number2) result = number1 - number2 ; 
	else if(number1 < number2) result = number2 - number1;
	
	return result;
	 
	}

	public static float division(float num1, float num2){
	
	if(num2 == 0) return 0;
	float result = num1 / num2; 
	return result;
	
	}

	public static int factor(int newNumber){
	
	int counter = 0;
	for(int multiple = 1; multiple <= newNumber; multiple++)

	if( newNumber % multiple == 0) counter++;
	return counter;	
	}

	public static boolean palindrome(int number){

	int digit1 = number / 10000 % 10;
	int digit2 = number / 1000 % 10;
	int digit3 = number / 100 % 10;
	int digit4 = number / 10 % 10;
	int digit5 = number / 1 % 10;

	if(digit1 == digit5 && digit2 == digit4) return true;
	return false;
	}


	public static long factorial(long number){

	long factorial = 1;
	int count = 1;
	
	
	for(count = 1; count <= number; count++) factorial *= count;
		
		return factorial; 
	}
	
	public static boolean isSquare(int number){

	for(int count = 1; count < number; count++)
	
	if(number / count == count) return true;
	return false;
	}

	
	
}