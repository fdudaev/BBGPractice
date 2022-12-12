import java.util.Arrays;

public class Anagram {
//java doc
    /**
     * This method takes two args and checks if they are anogram
     * anogram is a two args that have same characters
     * @param name1
     * @param name2
     * @return boolean
     */
    public static boolean isAnagram(String name1, String name2) {

        if (name1.length() != name2.length()){
            return false;
        }
        char [] c1 = name1.toLowerCase().toCharArray();
        char [] c2 = name2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return  Arrays.equals(c1, c2);

    }

    public static void main(String[] args) {
        System.out.println(isAnagram("aziza", "zzaia"));
    }

}
