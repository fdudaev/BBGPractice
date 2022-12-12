import java.util.Arrays;

public class findTarget {
    /**
     * The foal is to find target from two given arrays.
     * Create a method that will pass 3 parameters: array1, array2, and int target;
     * Create a main method to call findTarget method;
     */

    //public static int [] findTarget(int [] array1, int [] array2, int target){
    public static boolean findTarget(int [] array1, int [] array2, int target){

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] + array2[j] == target){
                    //return new int[] {array1[i] + array2[j]};
                    //return new int[]{i, j};
                    return true;
                }
            }
        }
        System.out.println("No two digits in two arrays make sum of " + target);
        return false;
        //return new int[]{};
    }
    public static void main (String [] args){

        int [] array1 = {2, 3, 4, 5, 6, 7, 8};
        int [] array2 = {2, 3, 4, 5, 6, 8, 1};
        int target = 50;
        System.out.println(findTarget(array1, array2, target));

        //System.out.println(Arrays.toString(findTarget(array1, array2, target)));
    }

}
