import java.util.Scanner;

public class computerguess {
    public static void main(String[] args) {
        Scanner range = new Scanner(System.in);
        System.out.println("Give me a number between 1 and 100");
        String num = range.nextLine();
        int Guess = (int)(Math.random() * 100 + 1);
        int max = 100;
        int min = 0;
        System.out.println("I guess " + Guess);
        String answer = "";
       // String compare = String.parseString(Guess);
          while (answer != "correct") {
              answer = range.nextLine();
              if (answer.equals("correct")) {
                  System.out.println("I got it right");
              } else if (answer.equals("higher")) {
                 min = Guess;
                  Guess = (int) (Math.random() * (max - min) + min + 1);
                  System.out.println(Guess);
              } else if (answer.equals("lower")) {
                  max = Guess;
                  Guess = (int) (Math.random() * (max - min) + min + 1);
                  System.out.println(Guess);
              }
          }
    }

}
