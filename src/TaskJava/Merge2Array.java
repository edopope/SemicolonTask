package TaskJava;

import java.util.Arrays;

public class Merge2Array {
    public static void main(String[] args) {
        int[] x = {1, 3, 4, 5};
    int[] y = {2, 6, 7, 8};

    int length = x.length + y.length;
    int counter = 0;
    int[] result = new int[length];
        for (int element : x) {
        result[counter++] = element;
    }
        for (int element2 : y) {
        result[counter++] = element2;
    }
        System.out.println(Arrays.toString(result) + "concated ARRAY!");

    //int[] newResult = new int[result.length];
    int temp = 0;
        for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result.length; j++) {
            if (result[i] < result[j]) {
                temp = result[i];
                result[i] = result[j];
                result[j] = temp;

            }
        }
    }
            System.out.print(Arrays.toString(result));

}
}



