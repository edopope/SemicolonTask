package TaskJava;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        int counter = 0;
        Scanner keyboard = new Scanner(System.in);
        int guessingNumber = 30;
        while (counter < 10) {
            System.out.println("GUESS MY BIRTH--DAY::");
            int answer = keyboard.nextInt();
                    if (answer > guessingNumber) {
                System.out.println("too high! Try Again");
                counter++;
            }  if (answer < guessingNumber) {
                System.out.println("too low! Try Again");
                counter++;
            }
            if (answer == guessingNumber) {
                System.out.println("you guessed right!");
                break;
            }
            if (counter == 10 && answer < guessingNumber || answer > guessingNumber) {
                System.out.println("OOPS! Times up! Try again");
            }
                }

            }
}
