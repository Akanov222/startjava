public class Calculator {
    public static void main(String[] args) {
        System.out.println("1. Калькулятор");
        int a = 8;
        int b = 2;
        String sign = "^";
        int result = 0;
        if (sign.equals("*")) {
            result = a * b;
        } else if (sign.equals("/")) {
            result = a / b;
        } else if (sign.equals("+")) {
            result = a + b;
        } else if (sign.equals("-")) {
            result = a - b;
        } else if (sign.equals("^")) {
            result = pow(a, b);
        } else if (sign.equals("%")) {
            result = a % b;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }

    private static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 0; i < powValue; i++) {
            result *= value;
        }
        return result;
    }
}
