public class Factorial {
    /**
     * factorial is a number that is that multiplies to a number -1
     */

    public static int factorial (int number){
        if (number <= 0){
            return 1;
        }
        else {
            return (number * factorial(number-1));
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
