import java.util.ArrayList;

/**
 * Created by ulisee on 01/05/17.
 */

// How to declare, add, replace, remove, acces and get the length in Array and ArrayList
public class Array_vs_ArrayList {
    public static void main(String[] args) {
        int size = 5;
        int myLength;
        int myValue;

//      Array:
        int[] myArray = new int[size];
        myArray[2] = 5;
        myLength = myArray.length;
        myValue = myArray[1];

//      ArrayList:
        ArrayList<Integer> myArrayList = new ArrayList<>();
        //ArrayList<Type> myArrayList = new ArrayList<Type>(size); 
        //'Integer' instead of 'int' because ArrayList does not support Primitive types, it supports Generic types
        myArrayList.add(1);    // adds '1' to the end of the list
        myArrayList.add(0,2);  // add(index i, element e);  shifts the elements automatically
        myArrayList.set(1,5);  // replaces the element at index '1' with the element '2'
        myArrayList.remove(1); // removes the element stored at index 'i' BUT return that element (or object)
        myLength = myArrayList.size();
        myValue = myArrayList.get(0);
    }
}
