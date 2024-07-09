import java.util.Scanner;
public class BackToSender{
public static void main(String []args){
	Scanner input = new Scanner(System.in);

	System.out.println("WELCOME TO BACK TO SENDER LOGISTICS.");
	System.out.println("PLEASE INPUT YOUR PASSWORD: ");
	String password = input.nextLine();

	System.out.println("Input the number of successful delivery by the Rider: ");
	int delivery = input.nextInt();

	int wageOfRider = BackToSenderFunction.WagesFunction(delivery);
	System.out.println("The wage of the Rider for today is " +wageOfRider);
}
}



	
