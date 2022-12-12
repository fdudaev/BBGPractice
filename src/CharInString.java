import java.lang.reflect.Array;
import java.util.Arrays;

public class CharInString {
    public static String  getStringIndex(String word){
        String guess = "m";

        for (int ind = word.indexOf(guess);
             ind >= 0;
             ind = word.indexOf(guess,ind + 1))
        {
            System.out.print(guess +" = ["+ind + "] ");
        }
        return "";
    }



    public static void main(String[] args) {



        int A [] = {-2, 7,1, 4, 5, 6, 7,2, 3, 5};
        int size = A.length;
        int target = 5;





    }
    
}
