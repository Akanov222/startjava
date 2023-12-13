public class CalculatorTest {
	public static void main(String[] args) {
	Calculator calculator = new Calculator("^", 8, 2);
	System.out.println(calculator.a + " " +
		calculator.sign + " " + calculator.b + " = " + calculator.getSign());
	}
}
