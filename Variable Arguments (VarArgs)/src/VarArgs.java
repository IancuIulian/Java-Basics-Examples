/**
 * Created by ulisee on 01/05/17.
 */
// not specifying how many integers (in method1) has the argument list of a method
public class VarArgs {
    public static void main(String[] args) {
        System.out.println(method1(3,12,5,66,2));
        System.out.println(method1(1,2,3,4,5,6,7,8,9,10));

        int[] n = {1,2,3};
        //there can only be one varArgs argument in a method, and it has to be the last argument on the list
        method2(n,"Alin","Ioan");
    }

    public static int method1(int...numbers){
        //prints how many integers were introduced
        int total=0;
        for(int x:numbers){
            total++;
        }
        return total;
    }

    public static void method2(int[] numbers, String...names){
        //prints the integers introduced, followed by the Strings introduced
        for (int x : numbers) {
            System.out.print(x+" ");
        }
        System.out.println();

        for (String x : names) {
            System.out.print(x+" ");
        }
    }

}
