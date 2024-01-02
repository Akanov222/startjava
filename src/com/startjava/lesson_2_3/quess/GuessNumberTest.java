import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        String repeat;
        boolean isRepeat;
        
        Scanner console = new Scanner(System.in);
        Player player = new Player();
        System.out.println("Введите имя");
        player.setName(console.nextLine());
        System.out.println("Добро пожаловать " + player.getName());
        do {
            System.out.println("Игра начинается!");
            GuessNumber guess = new GuessNumber();
            guess.guessRun();
            System.out.println("Хотите продолжить игру? [yes/no]: ");
            repeat = console.nextLine();
            isRepeat = repeat.equals("yes") || repeat.equals("no");
                while (!isRepeat) {
                    System.out.println("Введен не корректный ответ. Введите \"yes\" или \"no\"");
                    repeat = console.nextLine();
                    isRepeat = repeat.equals("yes") || repeat.equals("no");
                }
        } while (repeat.equals("yes"));
        console.close();
        System.out.println("Программа завершена!");
    }
}