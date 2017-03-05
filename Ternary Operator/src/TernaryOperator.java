/**
 * Created by ulise on 05/03/2017.
 *
 *  Ternary Operator - a single line IF condition
 */
public class TernaryOperator {
    public static void main(String[] args) {

        double grade = 7.5;
        String status;

        status = grade >= 5 ? "passed" : "failed";
        System.out.println(status);

//        if (grade >= 5) {
//            status = "passed";
//        }
//        else{
//            status = "failed";
//        }
//        System.out.println(status);
    }
}
