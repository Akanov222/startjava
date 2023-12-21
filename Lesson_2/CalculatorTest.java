import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){
        int a;
        int b;
        String sign = "";
        boolean isEquals;
        boolean isRepeat;
        String repeat;
        
        Scanner console = new Scanner(System.in);
        do {
            System.out.println("Введите первое число: ");
            a = console.nextInt();
            sign = console.nextLine();
            do {
                System.out.print("Введите знак математической операции: ");
                System.out.print("\b");
                sign = console.nextLine();
                isEquals = sign.equals("*") || sign.equals("/") || sign.equals("-") || sign.equals("+") ||
                sign.equals("^") || sign.equals("%");
                if (!isEquals) {
                System.out.println("Введенная математическая операция не поддерживается");
                }
            } while (!isEquals);
            System.out.println("Введите второе число: ");
            b = console.nextInt();
            Calculator calculator = new Calculator(sign, a, b);
            System.out.println(calculator.a + " " +
            calculator.sign + " " + calculator.b + " = " + calculator.getSign());
            System.out.println("Хотите продолжить вычисления? [yes/no]: ");
            repeat = console.nextLine();
            repeat = console.nextLine();
            isRepeat = repeat.equals("yes") || repeat.equals("no");
                while (!isRepeat) {
                System.out.println("Введен не корректный ответ. Введите \"yes\" или \"no\"");
                repeat = console.nextLine();
                isRepeat = repeat.equals("yes") || repeat.equals("no");
                }
        } while (repeat.equals("yes"));
        console.close();
    }
}
