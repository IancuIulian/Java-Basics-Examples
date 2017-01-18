/**
 * Created by ulisee on 01/18/17.
 *
 * Know that multidimensional arrays in java are actually arrays containing arrays
 * A jagged array (or ragged) is a two-dimensional array with rows of different length
 */
public class JaggedArraysMadeSimple {

    public static void main(String[] args) {
        int [][] numbers = new int [3][]; //here we specified that "numbers" has 3 rows, each row has ??? elements

        numbers[0] = new int[2]; //row 0 of "numbers" has 2 elements
        numbers[1] = new int[1]; //row 1 of "numbers" has 1 element
        numbers[2] = new int[3]; //row 2 of "numbers" has 3 elements

        // numbers.length returns the number of rows
        // for the number of columns you have to iterate through each row and check it's specific length (that is how many columns each row have)
        System.out.print("Rows length (in order): ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i].length+" ");
        }
        System.out.println();

        //initialization
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = i + j;
            }
        }

        //printing the array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }


    }
}


