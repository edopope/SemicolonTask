package TaskJava;

import java.util.Arrays;

public class NegativeIntegers {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,-1,-3,-4,5,-6};
        int [] negativeIntegers =  new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeIntegers[i] = numbers[i];
            }
           numbers[i] = negativeIntegers[i];
        }
        System.out.println(Arrays.toString(numbers));
    }
}
