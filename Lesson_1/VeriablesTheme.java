public class VeriablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte cpuCores = 5;
        System.out.println("CPU Cores = " + cpuCores);
        short ssd = 500;
        System.out.println("SSD " + ssd + " MB");
        int memory = 48;
        System.out.println("Memory " + memory + " GB");
        double display = 15.6;
        System.out.println("Display " + display + "''");
        float price = 1094.99f;
        System.out.println("Price €"+price);
        boolean is64BitVersion;
        char maidIn = '\uE513';
        System.out.println("Maid in " + maidIn + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        float pricePen = 100f;
        float priceBook = 200f;
        int discount = 11;
        System.out.println("Total = " + (pricePen + priceBook));
        System.out.println("Discount = " + discount + "%");
        System.out.println("Total with discount = " + ((pricePen + priceBook) - (pricePen + 
                priceBook) * discount / 100) + "\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println(
                "   J    a  v     v  a" + "\n" +
                "   J   a a  v   v  a a" + "\n" +
                "J  J  aaaaa  V V  aaaaa" + "\n" +
                " JJ  a     a  V  a     a" + "\n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte numByte = Byte.MAX_VALUE;
        short numShort = Short.MAX_VALUE;
        int numInt =Integer.MAX_VALUE;
        long numLong =Long.MAX_VALUE;
        System.out.println(numByte +"\n" + ((byte)(numByte+1)) + "\n"+ ((byte)(numByte-1)));
        System.out.println(numShort +"\n" + ((short)(numShort+1)) + "\n"+ ((short)(numShort-1)));
        System.out.println(numInt +"\n" + (numInt+1) + "\n"+ (numInt-1));
        System.out.println(numLong +"\n" + ((long)(numLong+1)) + "\n"+ ((long)(numLong-1)) + "\n");

        System.out.println("5. Перестановка значений переменных");
        System.out.println("Перестановка с помощью третьей переменной");
        int number1 = 2;
        int number2 = 5;
        int number3;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number3 = number1;
        number1 = number2;
        number2 = number3;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        System.out.println("Перестановка с помощью арифметических операций");
        int number4 = 2;
        int number5 = 5;
        System.out.println("number1 = " + number4 + "\n" + "number2 = " + number5);
        number4 = number4 * number5;
        number5 = number4 / number5;
        number4 = number4 / number5;
        System.out.println("number1 = " + number4 + "\n" + "number2 = " + number5);
        System.out.println("Перестановка с помощью побитовой операции ^");
        int number6 = 2;
        int number7 = 5;
        System.out.println("number1 = " + number6 + "\n" + "number2 = " + number7);
        number6 = number6^number7;
        number7 = number7^number6;
        number6 = number6^number7;
        System.out.println("number1 = " + number6 + "\n" + "number2 = " + number7 + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char simbol11 = (char) 36;
        char simbol12 = (char) 0x2A;
        char simbol13 = '@';
        char simbol14 = (char) 0b01111100;
        char simbol15 = '~';
        System.out.println(simbol11 + " " + (int) simbol11);
        System.out.println(simbol12 + " " + (int) simbol12);
        System.out.println(simbol13 + " " + (int) simbol13);
        System.out.println(simbol14 + " " + (int) simbol14);
        System.out.println(simbol15 + " " + (int) simbol15 + "\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char simbol1 = '/';
        char simbol2 = '\\';
        char simbol3 = '_';
        char simbol4 = '(';
        char simbol5 = ')';
        System.out.println(
                "    " + simbol1 + simbol2 + "\n" +
                "   " + simbol1 + "  " + simbol2 + "\n" +
                "  " + simbol1 + simbol3 + simbol4 + " " + simbol5 + simbol2 + "\n" +
                " " + simbol1 + "      " + simbol2 + "\n" +
                simbol1 + simbol3 + simbol3 + simbol3 + simbol3 + simbol1 + simbol2 + simbol3 + 
                simbol3 + simbol2 + "\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundred = (number / 100) % 10;
        System.out.println("Число " + number + " содержит:");
        System.out.println (" сотен - " + hundred);
        System.out.println (" десятков - " + tens);
        System.out.println (" единиц - " + units);
        System.out.println ("Сумма его цифр = " + (hundred + tens + units));
        System.out.println("Произведение = " + hundred * tens * units + "\n");

        System.out.println("9. Вывод времени");
        int newNumber = 86399;
        int seconds = newNumber % 60;
        int minutes = (newNumber/60) % 60;
        int hours = (newNumber/60/60) % 24;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
