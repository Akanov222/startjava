public class GuessNumber {
    public static void main(String[] args) {
        // guessNumber (0, 100]
        int guessNumber = 8;
        int result = 1;
        int i = 0;
        while (result != guessNumber) {
            if (result > guessNumber) {
                System.out.println("Число " + result + " больше того, что загадал компьютер");
            }
            if (result < guessNumber) {
                System.out.println("Число " + result + " меньше того, что загадал компьютер");
            }
            result += i;
            if (result <= 0) {
                result += 1;
            }
            if (result >100) {
                result-=114;
            }
            i++;
        }
        System.out.println("Вы победили!");
    }
}
