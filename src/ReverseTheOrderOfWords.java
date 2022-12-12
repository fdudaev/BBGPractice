import java.util.Arrays;
import java.util.Collections;

public class ReverseTheOrderOfWords {

    public static void reverseOrder(String text){

        String a = "";
        String b = "";
        String [] reversedOrder = text.split(" ");
        System.out.println(reversedOrder.length);
        for (String i : reversedOrder){
          //  System.out.println(String );
        }

    }

    public static void main(String[] args) {
        reverseOrder("This should be reversed");

        String r = "bloomberg is a great company";
        String [] g = r.split(" ");
        Arrays.sort(g);
        System.out.println(Arrays.toString(g));

        //g[4]+ " " +g[3]+ " " +g[2]+ " " +g[1]+ " " +g[0]


    }

}
