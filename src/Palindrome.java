import java.util.Locale;

public class Palindrome {
/**
 * Palindrome is when a word can be written same way from left to right and from right to left (civic)
 *
 *
 */

public static boolean isPalindrome1(String text) {

    System.out.println(new StringBuilder(text).reverse().toString().toLowerCase());
    return text.equals(new StringBuilder(text).reverse().toString().toLowerCase());
}

public static boolean isPalindrome(String word){

    String reverse = "";

    for (int i = word.length() -1; i >= 0 ;i--){
        reverse += word.charAt(i);
    }
    System.out.println(reverse);
    return word.equals(reverse);
}

    public static void main(String[] args) {
        System.out.println(isPalindrome("name"));
        System.out.println(isPalindrome1("aZiza"));
    }

}
