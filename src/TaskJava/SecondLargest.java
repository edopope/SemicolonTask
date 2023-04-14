package TaskJava;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[5];
        int counter = 0;

        int secondLargest = 0;
        while (counter < 5) {
            System.out.println("Enter a number!");
            int value = keyboard.nextInt();
            numbers[counter++] = value;


            }
            System.out.println(Arrays.toString(numbers));
            for (int i = 0; i < numbers.length; i++) {
                Arrays.sort(numbers);
                secondLargest = numbers[numbers.length - 2];

        }
        System.out.printf("%d", secondLargest);
    }
    }

