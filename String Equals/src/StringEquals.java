/**
 * Created by ulisee on 12/06/16.
 */
public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Bye";
        String s4 = new String("Hello");
        String s5 = "hello";

        System.out.println("s1 == s2       \\\\"+(s1==s2));  //  " \ " este "escape character"
        System.out.println("s1 == s4       \\\\"+(s1==s4));
        System.out.println("s1.equals(s4)  \\\\"+s1.equals(s4));
        System.out.println();
        System.out.println("s1.equals(s5)  \\\\"+s1.equals(s5));
        System.out.println("s1.equalsIgnoreCase(s5)  \\\\"+s1.equalsIgnoreCase(s5));

    }
}

/*Output:

s1 == s2       \\true
s1 == s4       \\false
s1.equals(s4)  \\true

s1.equals(s5)  \\false
s1.equalsIgnoreCase(s5)  \\true

*/
