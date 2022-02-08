/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  1) Split the input collection in half, forming two new collections
  2) If the size of the array is not 1, repeat step 1 on the new collections
  3) Once size is equal to 1, the collection is guaranteed to be sorted. Return the collection back to the distributor.
  4) If a collection is returned to you... create third collection. Compare the first index of each of the two original collections. Place larger value into new collection. If they are equal, put in either.
  5) Remove the value that was place into the new collection from the original collection
  6) Go back to step 4 until one of the original collections are empty. Then append all values from the non-empty collection into the new collection.
  7) Return to distributor
  8) Repeat step 4
  9) If size of the collection returned is equal to the size of the given array, then return the collection as final output.
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] mergeArr = new int[a.length + b.length];
    while (a.length > 0 && b.length > 0){
      if(a[0] < b[0]){
        mergeArr.add(a[0]);
      }else{
        mergeArr.add(b[0]);
      }
    }
    if(a.length == 0){
      for(int num : a){
        mergeArr.add(num);
    }
    }else{
      for(int num : b){
        mergeArr.add(num);
    }

  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {

  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
    /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
