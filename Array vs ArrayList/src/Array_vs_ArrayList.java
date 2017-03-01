import java.util.ArrayList;

/**
 * Created by ulisee on 01/05/17.
 *
 *  Use ARRAY when: - size of list never changes
 *                  - want a long list of numbers
 *
 *  Use ArrayList otherwise. - more flexible
 *
 *  ArrayList use wrapper classes (Generic types), these are objects so they store more memory than Array, which uses Primitive types.
 *  
 */

// How to declare, add, replace, remove, acces and get the length in Array and ArrayList
public class Array_vs_ArrayList {
    public static void main(String[] args) {
        int size = 5;
        int myLength;
        int myValue;

//      Array:
        int[] myArray = new int[size];   //declaration
        myArray[2] = 5;       //replace an element
                              //no inbuilt mechanism for removing elements
        myLength = myArray.length;  //get it's size (length)
        myValue = myArray[5];       //get an element

//      ArrayList:
        ArrayList<Integer> myArrayList = new ArrayList<>();   //declaration
        //ArrayList<Type> myArrayList = new ArrayList<Type>(size);
        //'Integer' instead of 'int' because ArrayList does not support Primitive types, it supports Generic types
        myArrayList.add(1);      // adds '1' to the end of the list
        myArrayList.add(0,2);    // add(index i, element e);  shifts the elements automatically
        myArrayList.set(1,5);    // replaces the element at index '1' with the value '5'
        myArrayList.remove(1);   // removes the element stored at index 'i' BUT returns that element (or object)
        myLength = myArrayList.size();   // get it's size (length)
        myValue = myArrayList.get(0);   // get an element

    }
}

