public class Calculator {
	String sign;
	int a;
	int b;
	double result;

	public Calculator(String sign, int a, int b) {
		this.sign = sign;
		this.a = a;
		this.b = b;
	}

	public double getSign() {
		switch (sign) {
			case "*": result = a * b;
				break;
			case "/": result = a / b;
				break;
			case "-": result = a - b;
				break;
			case "+": result = a + b;
				break;
			case "^": result = pow(a, b);
				break;
			case "%": result = a % b;
				break;
		}
		return result;
	}

	private static int pow(int value, int powValue) {
		int powResult = 1;
		for (int i = 0; i < powValue; i++) {
			powResult *= value;
		}
		return powResult;
	}
}
