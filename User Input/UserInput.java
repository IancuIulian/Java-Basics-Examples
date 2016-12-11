import java.util.Scanner;

/**
 * Created by ulisee on 12/04/16.
 */
public class UserInput {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = userInput.nextLine();
        System.out.print("Second name: ");
        String secondName = userInput.nextLine();
        System.out.println("Hello "+firstName+" "+secondName+"!");

        /*
        * Read a byte - nextByte();
        * Read a short - nextShort();
        * Read an int - nextInt();
        * Read a long - nextLong();
        * Read a float - nextFloat();
        * Read a double - nextDouble();
        * Read a boolean - nextBoolean();
        * Read a complete line - nextLine();
        * Read a word - next();
        */

    }
}
