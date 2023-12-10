public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte cpuCores = 5;
        System.out.println("CPU cores: " + cpuCores);
        short hddSize = 500;
        System.out.println("SSD size: " + hddSize + " MB");
        int ramSize = 48;
        System.out.println("RAM size: " + ramSize + " GB");
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
        System.out.println("Discount = " + sum * discount / 100);
        System.out.println("Total with discount = " + (sum - sum * discount / 100) + "\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println(
                "   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte maxByte = Byte.MAX_VALUE;
        System.out.print(maxByte++ + ", ");
        System.out.print(maxByte-- + ", ");
        System.out.println(maxByte);
        short maxShort = Short.MAX_VALUE;
        System.out.print(maxShort++ + ", ");
        System.out.print(maxShort-- + ", ");
        System.out.println(maxShort);
        int maxInt = Integer.MAX_VALUE;
        System.out.print(maxInt++ + ", ");
        System.out.print(maxInt-- + ", ");
        System.out.println(maxInt);
        long maxLong = Long.MAX_VALUE;
        System.out.print(maxLong++ + ", ");
        System.out.print(maxLong-- + ", ");
        System.out.println(maxLong + "\n");

        System.out.println("5. Перестановка значений переменных");
        System.out.println("Перестановка с помощью третьей переменной");
        int a = 2;
        int b = 5;
        int temp = a;
        System.out.println("a = " + a + "\n" + "b = " + b);
        a = b;
        b = temp;
        System.out.println("a = " + a + "\n" + "b = " + b);
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("a = " + a + "\n" + "b = " + b);
        a *= b;
        b = a / b;
        a /= b;
        System.out.println("a = " + a + "\n" + "b = " + b);
        System.out.println("Перестановка с помощью побитовой операции ^");
        System.out.println("a = " + a + "\n" + "b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + "\n" + "b = " + b + "\n");

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
        System.out.println("    " + slash + backslash + "\n"
                + "   " + slash + "  " + backslash + "\n"
                + "  " + slash + underscore + leftParenthesis
                + " " + rightParenthesis + backslash + "\n"
                + " " + slash + "      " + backslash + "\n"
                + slash + underscore + underscore + underscore
                + underscore + slash + backslash + underscore +
                underscore + backslash + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundred = (number / 100);
        System.out.println("Число " + number + " содержит:");
        System.out.println(" сотен - " + hundred);
        System.out.println(" десятков - " + tens);
        System.out.println(" единиц - " + ones);
        System.out.println("Сумма его цифр = " + (hundred + tens + ones));
        System.out.println("Произведение = " + hundred * tens * ones + "\n");

        System.out.println("9. Вывод времени");
        int totalSeconds = 86399;
        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds / 60) % 60;
        int hours = (totalSeconds / 3600);
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
