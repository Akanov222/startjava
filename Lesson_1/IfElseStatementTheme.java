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
        int c = 11;
        String property1 = "свойство";
        String property2 = "свойство";
        if (c % 2 == 0) {
            property2 = "четным";
        } else {
            property2 = "нечетным";
        }
        if (c == 0) {
        } else {
            if (c > 0) {
                property1 = "положительным";
            } else {
                property1 = "отрицательным";
            }
            System.out.println(c + " является " + property1 + " и " + property2 + "\n");
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        int d = 123;
        int f = 223;
        int hundreds1 = d / 100;
        int hundreds2 = f / 100;
        int tens1 = (d / 10) % 10;
        int tens2 = (f / 10) % 10;
        int ones1 = d % 10;
        int ones2 = f % 10;
        if ((hundreds1 == hundreds2) || (tens1 == tens2) || (ones1 == ones2)) {
            System.out.println("Исходные числа " + d + " и " + f);
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
            System.out.println("У чисел " + d + " и " + f + " одинаковые числа в соответствующих разрядах " +
                    "отсутствуют\n");
        }

        System.out.println("5. Определение символа по его коду");
        char g = '8';
        String propertySymbol = "не буквой и не цифрой";
        if (g == 'g' || g == 'b' || g == 'c' || g == 'd' || g == 'e' || g == 'f' || g == 'h' || g == 'g' || g == 'i' ||
                g == 'j' || g == 'k' || g == 'l' || g == 'm' || g == 'n' || g == 'o' || g == 'p' || g == 'q' || g ==
                'r' || g == 's' || g == 't' || g == 'u' || g == 'v' || g == 'w' || g == 'x' || g == 'y' | g == 'z') {
            propertySymbol = "маленькой буквой";
        } else if (g == 'A' || g == 'B' || g == 'C' || g == 'D' || g == 'E' || g == 'F' || g == 'H' || g == 'G' || g == 'I' ||
                g == 'J' || g == 'K' || g == 'L' || g == 'M' || g == 'N' || g == 'O' || g == 'P' || g == 'Q' || g ==
                'R' || g == 'S' || g == 'T' || g == 'U' || g == 'V' || g == 'W' || g == 'X' || g == 'Y' | g == 'Z') {
            propertySymbol = "большой буквой";
        } else if (g == '0' || g == '1' || g == '2' || g == '3' || g == '4' || g == '5' || g == '6' || g == '7' || g == '8' ||
                g == '9') {
            propertySymbol = "цифрой";
        }
        System.out.println("Символ " + g + " является " + propertySymbol + "\n");

        System.out.println("6.Подсчет суммы вклада и начисленных банком %");
        int sum = 301000;
        int percent = 0;

        if (sum < 100000) {
            percent = 5;
        }
        else if (sum > 100000 && sum <= 300000) {
            percent = 7;
        }
        else if (sum > 300000) {
            percent = 10;
        }
        int sumPercent = sum * percent / 100;
        System.out.println("Сумма вклада " + sum);
        System.out.println("Сумма начисленного процента " + sumPercent);
        System.out.println("Итоговая сумма " + (sum + sumPercent) + "\n");

        System.out.println("7.Определение оценки по предметам");
        class Calculate {
            String subject;
            int percent;
            int numericalValue;
            public void calculate(String subject, int percent) {
                this.subject = subject;
                this.percent = percent;
                if (percent <= 60){
                    numericalValue = 2;
                } else if (percent > 60 || percent <= 73) {
                    numericalValue = 3;
                } else if (percent > 73 || percent <= 91) {
                    numericalValue = 4;
                } else if (percent > 91) {
                    numericalValue = 5;
                }
                System.out.println(subject + " " + numericalValue);
            }
            public int getNumericalValue() {
                return numericalValue;
            }
        }
        String subject1 = "История";
        int percent1 = 59;
        Calculate calc1 = new Calculate();
        calc1.calculate(subject1, percent1);
        int numericalValue1 = calc1.getNumericalValue();

        String subject2 = "Программирование";
        int percent2 = 92;
        Calculate calc2 = new Calculate();
        calc2.calculate(subject2, percent2);
        int numericalValue2 = calc2.getNumericalValue();

        System.out.println("Средний балл оценок по предметам " + (float)(numericalValue1+numericalValue2) / 2);
        System.out.println("Средний процент по предметам " + (float)(percent1+percent2) / 2 + "\n");

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
