import java.util.Arrays;

public class FindFirstNonRepeatingChar {

    public static String sortString(String str) {

        char[] strToChar = str.toCharArray();
        Arrays.sort(strToChar);
        String sorted = new String(strToChar).toLowerCase();

        return sorted ;


    }

    public static int [] findTarget(int a1[],int [] a2, int target){

        for (int i = 0; i < a1.length; i++){
            for (int j = 0; j < a2.length; j++){
                if (a1[i] + a2[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int [] a1 = {2, 3, 4, 5, 6, 7, 3};
        int [] a2 = {1, 4, 6, 6, 2,8};
        int target = 8;
        System.out.println(Arrays.toString(findTarget(a1, a2, target)));
        System.out.println(sortString("Bloomberg"));


    }

}