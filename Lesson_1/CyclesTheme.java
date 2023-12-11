public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int min = -10;
        int max = 21;
        int tmp = min;
        do {
            if (tmp %2 == 1) {
                sumOddNumbers += tmp;
            } else {
                sumEvenNumbers += tmp;
            }
            tmp++;
        }
        while (tmp<=max);
        System.out.println("В отрезке [" + min + ", " + max + "] сумма четных чисел = " +
            sumEvenNumbers + " , а нечетных = " + sumOddNumbers + "\n");

        System.out.println("2. Вывод чисел в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int middle;
        min = number1;
        if (min<number2) {
            middle = number2;
        } else {
            middle = min;
            min = number2;
        }
        if (number3>middle) {
            max = number3;
        } else if(min<number3 && number3<=middle) {
            max = middle;
            middle = number3;
        } else {
            max = middle;
            middle = min;
            min = number3;
        }
        for (int i = max-1; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int digit;
        tmp = 1000;
        while (tmp>0)
        {
            digit = (number/tmp)%10;
            System.out.print(digit);
            number -= (digit * tmp);
            tmp /= 10;
        }
        System.out.println("\n");

        System.out.println("4. Вывод чисел в несколько строк");
        min = 1;
        max = 24;
        int count = 0;
        for (int requiredNumber = min; requiredNumber < max; requiredNumber++) {
            if (requiredNumber%2 == 1) {
                System.out.printf(requiredNumber + " ");
                count++;
            }
            if (count%5 == 0) {
                System.out.print("\n");
            }
            if (requiredNumber == max - 1 && count%5 != 0) {
                count %= 5;
                for (; count < 5; count++){
                    System.out.printf(0 + " ");
                }
            }
        }
        System.out.println("\n");

        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        number = 3242592;
        int numDigits = (int)Math.log10(number) + 1;
        count = 0;
        tmp = number;
        String evenOrOdd = " нечетное ";
        for (int i = 1; i <= numDigits; i++) {
            digit = tmp%10;
            if (digit == 2) {
                count++;
            }
            tmp = (tmp - digit) / 10;
        }
        if (count%2 ==1) {
        } else if (count%2 == 0 && count != 0) {
            evenOrOdd = " четное ";
        } else evenOrOdd = " ";
        System.out.println("В " + number + evenOrOdd + "количество двоек - " + count + "\n");

        System.out.println("6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int i = 0;
        while (i < 5) {
            int j = 5;
            while (j > i) {
                System.out.print("#");
                j--;
            }
            i++;
            System.out.println();
        }
        System.out.println();

        i = 0;
        int j = -1;
        while (i < 5) {
            count = 0;
            while (count < Math.abs(j)) {
                System.out.print("$");
                count++;
            }
            j--;
            i++;
            System.out.println();
            if (j ==-3) {
                j = Math.abs(j);
            }
            if (j == 0) {
                continue;
            }
        }
        System.out.println();

        System.out.println("7. Отображение ASCII-символов");
        char simbol;
        System.out.printf(" %6S", "decimal");
        System.out.print("   ");
        System.out.printf(" %6S", "character");
        System.out.print("   ");
        System.out.printf(" %12S", "description\n");
        for (int numChar = 15; numChar < 122; numChar++) {
            if (numChar == 48) {
                numChar = 97;
            }
            if (numChar%2==1) {
                simbol = (char)numChar;
                System.out.printf(" %6s", numChar);
                System.out.print("   ");
                System.out.printf(" %6s", simbol);
                System.out.print("   ");
                System.out.printf("    %12s", Character.getName(simbol));
                System.out.println();
            }
        }
        System.out.println();

        System.out.println("8. Проверка, является ли число палиндромом");
        number = 1234321;
        tmp = number;
        String resultCheck;
        numDigits = (int)Math.log10(number) + 1;
        int digitFirst;
        int digitLast;
        count = 0;
        int calc;
        for (i = 0; i < numDigits / 2; i++) {
            calc = CyclesTheme.pow(10,(numDigits - 1 - i*2));
            digitFirst = tmp % 10;
            digitLast = tmp / calc;
            if (digitFirst == digitLast) {
                count++;
            }
            tmp = (tmp - digitLast * calc)/10;
        }
        if (count == numDigits / 2) {
            resultCheck = "является";
        }
        else {
            resultCheck = "не является";
        }
        System.out.println("Число " + number + " " + resultCheck + " палиндромом\n");

        System.out.println("9. Проверка, является ли число счастливым");
        number = 122212;
        tmp = number;
        int sumFirst = 0;
        int sumLast = 0;
        digitFirst = tmp % 1000;
        digitLast = tmp / 1000;
        resultCheck = "счастливым \n";
        for (i = 0; i < 5; i++) {
            digit = tmp % 10;
            sumLast = sumLast + digit;
            tmp = tmp / 10;
            if ( i == 2) {
                sumFirst = sumLast;
                sumLast = 0;
            }
            if ( i == 4) {
                sumLast = sumLast + number / 100000;
            }
        }
        if (sumFirst != sumLast) {
            resultCheck = "не счастливым \n";
        }
        System.out.println("Число " + number + " является " + resultCheck +
            "Сумма цифр " + digitLast + " = " + sumLast +
            ", а сумма " + digitFirst + " = " + sumFirst + "\n");

        System.out.println("10. Отображение таблицы умножения Пифагора");
        calc = 0;
        System.out.printf(" %23S %n", "таблица  пифагора");
        for (i = 1; i < 10; i++) {
            for (j = 1; j < 10; j++) {
                if ((i == 1)&&(j == 1)) {
                    System.out.print("   ");
                }
                else {
                    calc = i * j;
                    System.out.printf(" %2s", calc);
                }
                if (j == 1) {
                    System.out.print(" |");
                }
            }
            System.out.println();
            if (i == 1) {
                for (int k = 1; k < 10; k++) {
                    System.out.printf(" %2s", "--");
                    if (k == 1) {
                        System.out.print(" |");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int pow(int value, int powValue) {
        int result = 1;
        for (int i = 0; i < powValue; i++) {
            result = result * value;
        }
        return result;
    }
}
