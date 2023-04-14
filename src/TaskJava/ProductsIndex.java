package TaskJava;
//Given a list, modify it so that each index stores the product of all elements in the list except the
//        element at the index itself
public class ProductsIndex {
    public static void main(String[] args) {
int [] scores = {2,4,6,8,10};
theProducts(scores);
    }
public static void theProducts(int [] array){
        int [] number = new int[array.length];
        for(int i = 0; i < number.length; i++){
            int temp = 1;
            for(int j = 0; j < number.length; j++){
                if(i == j){
                    continue;
                }
                temp *= array[i];
            }
            number[i] = temp;
            System.out.println(number[i]);

        }

}

}
