import javax.swing.*;
import java.util.EnumSet;

/**
 * Created by ulise on 05/03/2017.
 *
 * Technically one could indeed view enums as a class with a bunch of typed constants, and this is in fact how
 * enum constants are implemented internally. Using an enum however gives you useful methods (see Enum javadoc)
 * that you would otherwise have to implement yourself, such as Enum.valueOf.
 */
public class Enumeration {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Select task (1-5): ");

        Task task = Task.valueOf("TASK_"+input);

        JOptionPane.showMessageDialog(null, "Selected Task: " + task.getNumber());


        //printing the enum:
        for (Task t: Task.values() ) {
            System.out.println(t + "  " +t.getDecription() +"  "+ t.getNumber());
        }

        System.out.println("\n******* EnumSet.range(from,to) *************");

        for (Task t: EnumSet.range(Task.TASK_2, Task.TASK_4)) {
            System.out.println(t + "  " +t.getDecription() +"  "+ t.getNumber());
        }
    }

}

enum Task{
    TASK_1("One", 1),
    TASK_2("Two", 2),
    TASK_3("Three", 3),
    TASK_4("Four", 4),
    TASK_5("Five", 5);

    private final String description;
    private final int number;

    Task(String description, int number) {
        this.description = description;
        this.number = number;
    }

    public String getDecription(){
        return description;
    }

    public int getNumber(){
        return number;
    }
}
