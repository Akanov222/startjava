public class GuessNumber {
    private int guessNumber;
    private int attempt;
    
    public GuessNumber() {
        // guessNumber (0, 100]
        guessNumber = 1 + (int) (Math.random() * 101);
    }
    public int getGuessNumber() {
        return guessNumber;
    }
    public int getAttempt() {
        return attempt;
    }
    public void setAttempt() {
        attempt = 1 + (int) (Math.random() * 101);
    }
    public void guessRun() {
        setAttempt();
        while (attempt != guessNumber) {
            setAttempt();
            if (attempt > guessNumber) {
                System.out.println("Число " + attempt + " больше того, что загадал компьютер");
            } else if (attempt < guessNumber) {
                System.out.println("Число " + attempt + " меньше того, что загадал компьютер");
        }
        }
        System.out.println("Вы победили!");
        System.out.println("Загаданное число " + getGuessNumber());
    }
}
