public class GuessNumber {
    public static void main(String[] args) {
        // guessNumber (0, 100]
        int guessNumber = 8;
        int attempt = 1;
        while (attempt != guessNumber) {
            if (attempt > guessNumber) {
                System.out.println("Число " + attempt + " больше того, что загадал компьютер");
            } else if (attempt < guessNumber) {
                System.out.println("Число " + attempt + " меньше того, что загадал компьютер");
            } else if (attempt <= 0) {
                attempt++;
            } else if (attempt > 100) {
                attempt -= 100;
            }
            attempt++;
        }
        System.out.println("Вы победили!");
    }
}
