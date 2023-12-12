public class IfElseStatementTheme {
    public static void main (String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean male = true;
        if (!male) {
            System.out.println("Пол женский");
        } else {
            System.out.println("Пол мужской");
        }

        int age = 30;
        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }

        double height = 1.83;
        if (height < 1.8) {
            System.out.println("Рост ниже среднего");
        } else {
            System.out.println("Рост средний");
        }

        char firstLetterName = "Name".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени \"М\"");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени \"И\"");
        } else {
            System.out.println("Первая буква имени неизвестна\n");
        }

        System.out.println("2. Поиск большего числа");
        int a = 2;
        int b = 5;
        if (a > b) {
            System.out.println(a + " > " + b + "\n");
        } else if (a < b) {
            System.out.println(b + " > " + a + "\n");
        } else {
            System.out.println(a + " = " + b + "\n");
        }

        System.out.println("3. Проверка числа");
        int checkingNumber = 11;
        String property1 = "отрицательным";
        String property2 = "нечетным";
        if (checkingNumber == 0) {
            System.out.println(checkingNumber + " является ни положительным ни отрицательным\n");
        } else {
            if (checkingNumber % 2 == 0) {
                property2 = "четным";
            }
            if (checkingNumber > 0) {
                property1 = "положительным";
            }
            System.out.println(checkingNumber + " является " + property1 + " и " + property2 + "\n");
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 223;
        int hundreds1 = number1 / 100;
        int hundreds2 = number2 / 100;
        int tens1 = (number1 / 10) % 10;
        int tens2 = (number2 / 10) % 10;
        int ones1 = number1 % 10;
        int ones2 = number2 % 10;
        if ((hundreds1 == hundreds2) || (tens1 == tens2) || (ones1 == ones2)) {
            System.out.println("Исходные числа " + number1 + " и " + number2);
            if (hundreds1 == hundreds2) {
                System.out.println("Одинаковые цифры " + hundreds1 + ". Номер разряда 3.");
            }
            if (tens1 == tens2) {
                System.out.println("Одинаковые цифры " + tens1 + ". Номер разряда 2.");
            }
            if (ones1 == ones2) {
                System.out.println("Одинаковые цифры " + ones1 + ". Номер разряда 1.");
            }
            System.out.println();
        } else {
            System.out.println("У чисел " + number1 + " и " + number2 +
                    " одинаковые числа в соответствующих разрядах " + "отсутствуют\n");
        }

        System.out.println("5. Определение символа по его коду");
        char simbol = '8';
        String state = "не буквой и не цифрой";
        if (simbol >= 'a' && simbol <='z') {
            state = "маленькой буквой";
        } else if (simbol >= 'A' && simbol <= 'Z') {
            state = "большой буквой";
        } else if (simbol >= '0' && simbol <= '9') {
            state = "цифрой";
        }
        System.out.println("Символ " + simbol + " является " + state + "\n");

        System.out.println("6.Подсчет суммы вклада и начисленных банком %");
        int sum = 301000;
        int percent = 5;
        if (sum > 100000 && sum <= 300000) {
            percent = 7;
        } else if (sum > 300000) {
            percent = 10;
        }
        int sumPercent = sum * percent / 100;
        System.out.println("Сумма вклада " + sum);
        System.out.println("Сумма начисленного процента " + sumPercent);
        System.out.println("Итоговая сумма " + (sum + sumPercent) + "\n");

        System.out.println("7.Определение оценки по предметам");
        String subject = "История";
        percent = 59;
        int numericalValue = 5;
        float totalPercent = 0;
        float totalNumericalValue = 0;
        for (int i = 0; i < 2; i++) {
            if (percent <= 60) {
                numericalValue = 2;
            } else if (percent > 60 || percent <= 73) {
                numericalValue = 3;
            } else if (percent > 73 || percent <= 91) {
                numericalValue = 4;
            }
            totalPercent += percent;
            totalNumericalValue += numericalValue;
            System.out.println(subject + " " + numericalValue);
            if (i == 0) {
                subject = "Программирование";
                percent = 92;
            }
        }
        System.out.println("Средний балл оценок по предметам " + totalNumericalValue / 2);
        System.out.println("Средний процент по предметам " + totalPercent / 2 + "\n");

        System.out.println("8.Расчет годовой прибыли");
        int proceedsMonth = 13000;
        int spaceRentalMonth = 5000;
        int productionCostMonth = 9000;
        int incomeYear = (proceedsMonth - spaceRentalMonth - productionCostMonth) * 12;
        if (incomeYear > 0) {
            System.out.println("Прибыль за год: +" + incomeYear + " руб.\n");
        } else {
            System.out.println("Прибыль за год: " + incomeYear + " руб.\n");
        }
    }
}
