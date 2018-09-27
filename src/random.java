import java.util.Scanner;

public class random {
    public static void main (String[] args) {
        int random = (int)(Math.random() * 5 + 1);
        Scanner guess = new Scanner(System.in);
        System.out.println("Give your best guess");
        String compared = guess.nextLine();
        Double newCompared = Double.parseDouble(compared);
        if (newCompared == random) {
            System.out.println("correct");
        }
        else {
            System.out.println("actually its " + random);
        }
    }
}
