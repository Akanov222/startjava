public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte processorCoresNumber = 5;
        System.out.println("CPU cores: " + processorCoresNumber);
        short hardDiskMemory = 500;
        System.out.println("SSD memory: " + hardDiskMemory + " MB");
        int operationMemory = 48;
        System.out.println("RAM memory: " + operationMemory + " GB");
        double displaySize = 15.6;
        System.out.println("Display size: " + displaySize + "''");
        float computerPrice = 1094.99f;
        System.out.println("Price €" + computerPrice);
        boolean is64BitVersion = true;
        System.out.println("Version 64Bit: " + is64BitVersion);
        char productProducedCountry = 'C';
        System.out.println("Produced country: " + productProducedCountry + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        float pricePen = 100f;
        float priceBook = 200f;
        float sum = pricePen + priceBook;
        int discount = 11;
        System.out.println("Total = " + sum);
        System.out.println("Discount = " + discount + "%");
        System.out.println("Total with discount = " + (sum - sum * discount / 100) + "\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println(
                "   J    a  v     v  a\n" +
                        "   J   a a  v   v  a a\n" +
                        "J  J  aaaaa  V V  aaaaa\n" +
                        " JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte numberByte = Byte.MAX_VALUE;
        System.out.print(numberByte + ", ");
        numberByte++;
        System.out.print(numberByte + ", ");
        numberByte--;
        System.out.println(numberByte);
        short numberShort = Short.MAX_VALUE;
        System.out.print(numberShort + ", ");
        numberShort++;
        System.out.print(numberShort + ", ");
        numberShort--;
        System.out.println(numberShort);
        int numberInt = Integer.MAX_VALUE;
        System.out.print(numberInt + ", ");
        numberInt++;
        System.out.print(numberInt + ", ");
        numberInt--;
        System.out.println(numberInt);
        long numberLong = Long.MAX_VALUE;
        System.out.print(numberLong + ", ");
        numberLong++;
        System.out.print(numberLong + ", ");
        numberLong--;
        System.out.println(numberLong);

        System.out.println("5. Перестановка значений переменных");
        System.out.println("Перестановка с помощью третьей переменной");
        int a = 2;
        int b = 5;
        System.out.println("a = " + a + "\n" + "b = " + b);
        int temp1 = a;
        a = b;
        b = temp1;
        System.out.println("a = " + a + "\n" + "b = " + b);
        System.out.println("Перестановка с помощью арифметических операций");
        int c = 2;
        int d = 5;
        System.out.println("c = " + c + "\n" + "d = " + d);
        c *= d;
        d = c / d;
        c /= d;
        System.out.println("c = " + c + "\n" + "d = " + d);
        System.out.println("Перестановка с помощью побитовой операции ^");
        int e = 2;
        int f = 5;
        System.out.println("e = " + e + "\n" + "f = " + f);
        e ^= f;
        f ^= e;
        e ^= f;
        System.out.println("e = " + e + "\n" + "f = " + f + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println(dollar + " " + (int) dollar);
        System.out.println(asterisk + " " + (int) asterisk);
        System.out.println(atSign + " " + (int) atSign);
        System.out.println(verticalBar + " " + (int) verticalBar);
        System.out.println(tilde + " " + (int) tilde + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println(
                "    " + slash + backslash + "\n" +
                        "   " + slash + "  " + backslash + "\n" +
                        "  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash + "\n" +
                        " " + slash + "      " + backslash + "\n" +
                        slash + underscore + underscore + underscore + underscore + slash + backslash + underscore +
                        underscore + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundred = (number / 100) % 10;
        System.out.println("Число " + number + " содержит:");
        System.out.println(" сотен - " + hundred);
        System.out.println(" десятков - " + tens);
        System.out.println(" единиц - " + units);
        System.out.println("Сумма его цифр = " + (hundred + tens + units));
        System.out.println("Произведение = " + hundred * tens * units + "\n");

        System.out.println("9. Вывод времени");
        int newNumber = 86399;
        int seconds = newNumber % 60;
        int minutes = (newNumber / 60) % 60;
        int hours = (newNumber / 60 / 60) % 24;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
