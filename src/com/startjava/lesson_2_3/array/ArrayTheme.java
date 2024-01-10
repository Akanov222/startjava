import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class ArrayTheme {
    
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] array = {2, 4, 3, 5, 7, 1, 8};
        System.out.print("До реверса: [");
        for (int i = 0; i < array.length; i++) {
            if (i != (array.length - 1)) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] + "]");
            }
        }
        int temp;
        for (int i = 0; i<(array.length / 2); i++) {
            temp = array[i];
            array[i] = array[(array.length - i - 1)];
            array[(array.length - i - 1)] = temp;
        }
        System.out.print("После реверса: [");
        for (int i = 0; i < array.length; i++) {
            if (i != (array.length - 1)) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[i] + "]\n");
            }
        }
        
        System.out.println("2.Произведение элементов массива");
        array = new int[10];
        String sign = " + ";
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int result = array[1];
        for (int i = 1; i < array.length - 1; i++) {
            result *= array[i];
            sign = i < array.length - 2 ? " * " : " = ";
            System.out.print(array[i]);
            System.out.print(sign);
        }
        System.out.println(result + "\n");
        
        System.out.println("3.Удаление элементов массива");
        double[] arrayDouble = new double[15];
            System.out.print("Исходный массив [");
        for (int i = 0; i < 15; i++) {
            arrayDouble[i] = Math.random();
            System.out.print(String.format("%.3f", arrayDouble[i]));
            if (i < 14) {
                System.out.print(", ");
            } else {
                System.out.print("]\n");
            }
            if (i == 7) {
                System.out.println();
            }
        }
        int index = 15 / 2;
        int count = 0;
        double[] arrayDoubleChange = new double[15];
        System.out.print("Измене́нный массив [");
            for (int i = 0; i < 15; i++) {
            if (arrayDouble[i] > arrayDouble[index]) {
                arrayDoubleChange[i] = 0;
                count++;
            } else {
                arrayDoubleChange[i] = arrayDouble[i];
            }
        }
        for (int i = 0; i < 15; i++) {
            System.out.print(String.format("%.3f", arrayDoubleChange[i]));
            if (i < 14) {
                System.out.print(", ");
            } else {
                System.out.print("]\n");
            }
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println("Количество замен " + count + "\n");
        
        System.out.println("4.Вывод алфавита лесенкой");
        char[] arrayChar = new char[26];
        for (int i = 0; i < 26; i++) {
            arrayChar[i] = (char) (65 + i);
        }
        count = 0;
        for (int i = 25; i >= 0; i--) {
            int k = 25;
            for (int j = 0; j <= count; j++) {
                System.out.print(arrayChar[k]);
                k--;
            }
            if (count < 25) {
                count++;
            } else {
                break;
            }
            System.out.println();
        }
        System.out.println("\n");
        
        System.out.println("5.Заполнение массива уникальными числами");
        array = new int[30];
        count = 0;
        Random random = new Random();
        array[0] = random.nextInt(40) + 60;
            for (int i = 1; i < 30;) {
            temp = random.nextInt(40) + 60;
                count = 0;
                for (int j = 0; j < 30; j++) {
                    if (temp == array[j]) {
                       count++;
                    }
                } if (count == 0) {
                    array[i] = temp;
                    i++;
                }
            }
        Arrays.sort(array);
        count = 1;
        for (int values : array) {
            if (count % 30 == 0) {
                System.out.println(values);
                break;
            }
            if (count % 10 == 0) {
                System.out.println(values + ", ");
            } else {
                System.out.print(values + ", ");
            }
            count++;
        }
    }
}