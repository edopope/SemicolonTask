package TaskJava;

public class DivisbleBy3 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0){
                total +=i;

            }
        }
            System.out.println(total);
    }
}
