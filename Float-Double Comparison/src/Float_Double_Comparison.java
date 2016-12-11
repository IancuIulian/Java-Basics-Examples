/**
 * Created by ulisee on 12/04/16.
 */
public class Float_Double_Comparison {

    public static void main(String[] args) {
        final double EPSILON = 0.0001;

        double result = 0.3 - 0.2;
        float result2 = 0.3f - 0.2f;

        System.out.println("double result: "+result);
        System.out.println("float result: "+result2);

        System.out.print("Comparison: ");
        if (Math.abs(result-result2) < EPSILON){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }

}
