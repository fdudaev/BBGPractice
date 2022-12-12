import java.util.Arrays;

public class Robot {

    public int floor;
    public int jumps;

    public Robot(boolean jumped){}


    public boolean reliableJump(boolean jumped, int jumps){

        if (jumped){
            this.floor = jumps+1;
            System.out.println("The robot was on step "+jumps+ " and jumped to step "+floor);
            return true;
        }else{
            System.out.println("The robot did not move from spot");
            return false;
        }

    }

    public static void main(String[] args) {


       /* Robot r1 = new Robot(true);
        r1.reliableJump(true, 5);

        String test = "My name is Farrukh Z";

        System.out.println(test.split(" "));
*/
    }

}
