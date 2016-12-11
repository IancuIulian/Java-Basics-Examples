/**
 * Created by ulisee on 12/08/16.
 */
public class StringConversion {
    public static void main(String[] args) {
        System.out.println("From VALUE to STRING:");
    // From VALUE to STRING
        String s;
        s = String.valueOf(1234543210L);
        System.out.println(s);

        s = String.valueOf(23.32f);
        System.out.println(s);

        s = String.valueOf(true);
        System.out.println(s);

        System.out.println("From STRING to VALUE:");
    //From STRING to VALUE
        String s2;
        s2 = "12";
        int val = Integer.parseInt(s2);  // Byte.parseByte(); Double.parseDouble();  Boolean.parseBoolean();  ...
        System.out.println(val);

        s2 = "A";
        char c = s2.charAt(0);
        System.out.println(c);

    }
}
