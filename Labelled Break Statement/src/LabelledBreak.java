/**
 * Created by ulisee on 12/06/16.
 */
public class LabelledBreak {
    public static void main(String[] args) {
        int n = 6;

        ulise:
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("    "+i);
                System.out.print(" "+j);
                if (i == 3){
                    System.out.print("   ..tsss");
                    break ulise;
                }
            }
            System.out.println();

        }
    }
}
