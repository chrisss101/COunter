import java.util.Scanner;

public class computerguess {
    public static void main(String[] args) {
        Scanner range = new Scanner(System.in);
        System.out.println("Give me a number between 1 and 100");
        String num = range.nextLine();
        int Guess = (int)(Math.random() * 100 + 1);
        int oldGuess = 0;
        System.out.println("I guess " + Guess);
        String answer = range.nextLine();
       // String compare = String.parseString(Guess);
        if (answer.equals("correct")) {
            System.out.println("I got it right");
        }
        else if (answer.equals("higher")) {
            oldGuess = Guess;
            Guess = (int)(Math.random() * (100 - oldGuess) + oldGuess + 1);
            System.out.println(Guess);
        }
        else if (answer.equals("lower")) {
            oldGuess = Guess;
            Guess = (int)(Math.random() * oldGuess + 1);
            System.out.println(Guess);
        }
    }
}
