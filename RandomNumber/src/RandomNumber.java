/**
 * Created by ulise on 23/03/2017.
 */
public class RandomNumber {
    public static void main(String[] args) {
        int a = 2;
        int b = 8;
        System.out.println( rand(a,b));
    }

    public static int rand(int min, int max){
        //returns a random number between min and max, both included:    [min,max]
        return (min + (int)(Math.random() * (max+1 - min)));
    }
}
