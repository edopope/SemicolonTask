package TaskJava;

public class Ventures {
    public static void main(String[] args) {
        String name = "VENTURES";
        //int counter = 0;
        for (int i = 0; i <name.length() ; i+=2) {
            char letter = name.charAt(i);
            char letter2 = name.charAt(i + 1);
                System.out.println(letter + " " + letter2);

            }
        }
    }

