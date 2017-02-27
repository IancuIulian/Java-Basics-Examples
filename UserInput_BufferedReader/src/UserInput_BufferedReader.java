import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by ulise on 27/02/2017.
 *
 *  A Stream is like a river on which data is found (binary data that flows is some direction)
 *
 *  Data Source  ----InputStream--->  Your Program
 *  Data Source  <---OutputStream---  Your Program
 *
 *  Data Source - can be a network, a file, ..
 *
 */
public class UserInput_BufferedReader {

    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");

        String s = br.readLine();
        int number = Integer.parseInt(s);

        System.out.println(number);

    }

}
