package TaskJava;

public class NonRepeating {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 1, 3};
        int non = 0;
        for (int number : arrays) {
            //for (int j = 0; j < arrays.length; j++) {
            if (unique(arrays, arrays[number])) {
                System.out.print(arrays[number]);
            }

        }
        }
   // }
    public static boolean unique(int[] array, int number){
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
             check = true;
            }
        }
        return check;
    }
}
