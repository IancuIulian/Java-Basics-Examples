import java.io.Console;

/**
 * Created by ulise on 27/02/2017.
 *
 *  This will throw a "NullPointerException"
 *  Will work only in Command Prompt
 *
 *  Using java in cmd:
 *   - go to: [Run]:'sysdm.cpl' > 'System Properties' > 'Advanced' > 'EnvironmentVariables' > 'New':
 *          Variable Name: PATH
 *          Variable value: C:\Program Files\Java\jdk(version)\bin
 *
 *   - open cmd > set directory (using 'pushd' or 'cd')
 *          1. >javac HelloWorld.java  (will gerenate .Class file)
 *          2. >java HelloWorld
 */
public class UserInput_Console {

    public static void main(String[] args) {
        Console console = System.console();

        System.out.print("Enter a number: ");

        String s = console.readLine();
        int number = Integer.parseInt(s);

        System.out.println(s);
    }
}
