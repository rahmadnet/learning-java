package Arrays;

/**
* <h1>Java Array Testing</h1>
* This Program is just for testing java Arrays
* and printing array of Objects
* @author  Rahmad Nasution
* @version 0.1
* @since   2019-07-19
*/

/**
 * This example explains how to create and use single and 
 * multidimensional arrays
 */

public class JavaArrays {

  public static void main(String args[]) {
    
   /* 
    *create an array of primitives - 10 integers
    *Since an array is an object we have to instantiate
    *it with the new keyword
    */
    int iArr[] = new int[10];
    
     /*iterating across the array using a traditional for loop
      * notice how we get the length of the array
      */
    for (int i = 0; i < iArr.length; i++) {
      // Assign a value to the i th location of the array
      iArr[i] = i * 100;
    }
    printArray(iArr);

     /*create an array of floats
      * Here we create and populate the array at the same time
      */
    float[] fArr = { 1.2f, 3.4f, 4.5f, 5.6f };    
    printArray(fArr);

     /*Let's create an array of String objects
      *When creating an array of objects, we need to instantiate the array
      *object as well as the Objects which will be held in the array
      *We first create an array capable of holding 10 Strings
      */
    String stringArr[] = new String[10];
    
    // Now let us create the Strings to put in the array
    for (int i = 0; i < 10; i++) {
      /*notice that we had to instantiate the array object and 
       * each String object which we put into the array as well.
       */
      stringArr[i] = new String(String.valueOf(i));
    }    
    printArray(stringArr);

    // Now let's create multidimensional arrays
    int iMultiDim[][] = new int[3][3];
    for (int d1 = 0; d1 < 3; d1++) {
      for (int d2 = 0; d2 < 3; d2++) {
        iMultiDim[d1][d2] = d1 * d2;
      }
    }
    printArray(iMultiDim);
  }

  private static void printArray(int array[]) {
    // printing array of integers
    // Here we will use the enhanced for loop
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println("");
  }

  private static void printArray(float array[]) {
    // printing array of floats
    for (float f : array) {
      System.out.print(f + " ");
    }
    System.out.println("");
  }

  private static void printArray(Object array[]) {
    // printing array of Objects
    for (Object f : array) {
      System.out.print(f + " ");
    }
    System.out.println("");
  }

  private static void printArray(int mDimArray[][]) {
    for (int i = 0; i < mDimArray.length; i++) {
      for (int j = 0; j < mDimArray[i].length; j++) {
        System.out.print(mDimArray[i][j]);
      }
      System.out.println("");
    }
  }
}
