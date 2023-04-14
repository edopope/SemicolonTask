package TaskJava;



public class Occurences {
    public static void main(String[] args) {
        String word = "Mississippi";
        int Icounter = 0;
        int Scounter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'i'){
                Icounter++;
            }
            else if (word.charAt(i) == 's'){
                Scounter++;
            }
        }
              System.out.printf("%d%n%d", Icounter, Scounter);

    }
}
