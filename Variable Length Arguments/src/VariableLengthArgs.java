/**
 * Created by ulisee on 01/05/17.
 */
// not specifying how many integers (in this example) has the argument list of a method
public class VariableLengthArgs {
    public static void main(String[] args) {
        System.out.println(method1(3,12,5,66,2));
        System.out.println(method1(1,2,3,4,5,6,7,8,9,10));
    }

    public static int method1(int...numbers){
        int total=0;
        for(int x:numbers){
            total++;
        }
        return total;
    }
}
