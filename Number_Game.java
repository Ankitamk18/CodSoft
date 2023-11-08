import java.util.*;

public class Number_Game {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min = 1, max = 100, attempts = 10, score = 0;
        boolean play_Again = true;

        while (play_Again) {
            int number = (int) (Math.random() * (max - min + 1) + min);
            System.out.println("I have generated a number between " + min + " and " + max + ". You have " + attempts + " attempts to guess the number.");

            for (int i = 1; i <= attempts; i++) {
                System.out.print("Attempt #" + i + ": ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the number in " + i + " attempt(s).");
                    score++;
                    break;
                } 
                else if (guess < number) {
                    System.out.println("Your guess is too low.");
                } 
                else {
                    System.out.println("Your guess is too high.");
                }

                if (i == attempts) {
                    System.out.println("Sorry, you have exhausted all your attempts. The correct number was " + number + ".");
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            String choice = sc.next();

            if (!choice.equalsIgnoreCase("y"))
             {
                play_Again =false;
              }
else
{
    System.out.println("Hello");
}
 
}
    }
}
