import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultiplicationCalculatorTest{

	@Test
	public void testCanMultiply(){
	
	//given
	MultiplicationCalculator calculator = new MultiplicationCalculator();
	//when
	int number1 = 2;
	int number2 = 3;
	
	int product = calculator.multiply(number1, number2);
	
	//assert
	assertEquals(6, product);

	}





}