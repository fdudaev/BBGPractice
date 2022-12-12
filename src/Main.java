import java.util.Arrays;

public class Main {
    public static boolean reverseStr(String firstName, String lastName) {



        TestInt t1 = new TestInt();
        t1.callName();
        t1.speed();
        System.out.println("\n" +new StringBuilder(firstName).append(lastName));
        System.out.println(new StringBuilder(firstName+ lastName).reverse().toString().toLowerCase());
        System.out.println(new StringBuilder(firstName).append(99));
        System.out.println(new StringBuilder(firstName).capacity());
        System.out.println(new StringBuilder(lastName).insert(1, 2)); // inserting int 2 in index 1 position
        System.out.println("___________________");

        System.out.println(new StringBuilder(firstName).reverse().toString().toLowerCase());
        return firstName.equals(new StringBuilder(firstName).reverse().toString());
    }

    public static void main(String[] args) {


        reverseStr("Aliya", "Farrukhi");


        int [] a1 = {3,1,4,7,6,1,7,90};
        int [] a2 = {5,8,1,65,34,12,7,9,2};
        int target = 555;
        System.out.println(Arrays.toString(findTarget(a1, a2, target)));


//your method should return index 1 a1, and index 2 from a2

    }

    public static  int [] findTarget (int[] a1, int [] a2, int target){

        for (int i = 0; i < a1.length; i++){
            for (int j = 0; j < a2.length; j++){
                if (a1[i] + a2 [j] == target ){
                    //return new int[] {a1[i], a2[j]};
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }

}