public class Calculator {
    String sign;
    double a;
    double b;
    double result;
    
    public Calculator(String sign, double a, double b) {
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
    
    private static double pow(double value, double powValue) {
        double powResult = 1;
        for (int i = 0; i < powValue; i++) {
            powResult *= value;
        }
        return powResult;
    }

}
