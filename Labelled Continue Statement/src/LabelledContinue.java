/**
 * Created by ulisee on 12/06/16.
 */
public class LabelledContinue {
    public static void main(String[] args) {
        int n = 6;

        ulise:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 3){
                    continue ulise;
                }
                System.out.print("    "+i);
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
