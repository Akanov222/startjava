public class Calculator {
    public static void main(String[] args) {
        System.out.println("1. Калькулятор");
        int number1 = 8;
        int number2 = 2;
        Character sign = '^';
        int result = 0;
        if (sign.equals('*')) {
            result = number1 * number2;
        } else if (sign.equals('/')) {
            result = number1 / number2;
        } else if (sign.equals('+')) {
            result = number1 + number2;
        } else if (sign.equals('-')) {
            result = number1 - number2;
        } else if (sign.equals('^')) {
            result = Calculator.pow(number1, number2);
        } else if (sign.equals('%')) {
            result = number1 % number2;
        }
        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 0; i < powValue; i++) {
            result = result * value;
        }
        return result;
    }
}
