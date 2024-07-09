import java.util.Scanner;
public class Asterisk{
	public static void main(String []args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of row: ");
	int numberOfRow = input.nextInt();
	
	System.out.print("(a)");
	System.out.println();

	int count = 1;
	int pattern = 1;
	
	for(count = 1; count <= numberOfRow; count++){
	
	for(pattern = 1; pattern <= count; pattern++){
	System.out.print("* ");}
	
	System.out.println();
}

	System.out.print("(b)");
	System.out.println();

	count = 1;
	pattern = 10;
	
	
	for(count = 1; count <= numberOfRow; count++){
	
	for(pattern = numberOfRow; pattern >= count; pattern--){
	System.out.print("* ");}
	
	System.out.println();
}
	



}
}