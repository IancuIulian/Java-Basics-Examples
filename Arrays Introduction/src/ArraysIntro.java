/**
 * Created by ulisee on 12/11/16.
 */
public class ArraysIntro {
    public static void main(String[] args) {
        int size = 10;

        int[] numbers = new int[size];  //stored in Heap memory:  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // int[] n = {0,1,2,3,4,5}    - another way of declaring
        printArray("numbers: ", numbers, size);

        int[] scores = numbers; // array "scores" points to the same addres as "numbers", that is in the Heap
        printArray("scores:  ", scores, size);

        scores[3] = 9;  // when we change the value of "scores", the value of "numbers" also changes
        printArray("\nnumbers: ", numbers, size);
        printArray("scores:  ", scores, size);


    }

    private static void printArray(String s, int[] numbers, int size) {
        System.out.print(s);
        for (int i = 0; i < size; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
    }
}
