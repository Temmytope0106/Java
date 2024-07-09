public class BackToSenderFunction{

	public static int WagesFunction(int delivery){

	int basepay = 500;
	int amountPerParcel = 0;

	if(delivery > 100) amountPerParcel = 500;
	if(delivery <= 100 && delivery >= 70) amountPerParcel = 500;
	if(delivery <=  69 && delivery >= 60) amountPerParcel = 250;
	if(delivery <= 59 && delivery >= 50)  amountPerParcel = 200;
	if(delivery <= 50 && delivery > 0)    amountPerParcel = 160;
	if(delivery < 0) amountPerParcel = 500;

	int result = delivery * amountPerParcel + basepay ;

	return result;

	}
}