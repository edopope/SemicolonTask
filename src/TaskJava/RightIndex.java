package TaskJava;

import java.util.Arrays;

public class RightIndex {
    public static void main(String[] args) {
        int[] age = {1,2,3,4,5};
        int temp = age[age.length-1];
        for (int i = age.length - 1; i > 0; i--) {
            age[i] = age[i-1];


        }
        age[0] = temp;
        System.out.print(Arrays.toString(age));
        }

    }

