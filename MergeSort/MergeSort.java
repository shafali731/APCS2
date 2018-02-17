//Shafali Gupta
//APCS2 -pd 01
//HW 05 -  Step 1: Split, Step 2: ?, Step 3: Sorted!. . .
//2018-02-07
/*you look at the 1st element of each array, going throuhg each array index by index. The one with a smaller value is inserted in the new array first. Then the bigger one. */
/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:

  ======================================*/

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
    int[] retArr = new int[a.length + b.length];
    int aCurr =0;
    int bCurr =0;
    int retCurr =0;
    while(retCurr<retArr.length){
    if (aCurr >= a.length){
      for (int i=0;bCurr <b.length;i++){
        retArr[retCurr] = b[bCurr];
        retCurr +=1;
        bCurr +=1;
      }
      return retArr;
    }
    if (bCurr >= b.length){
      for (int i=0;aCurr <a.length;i++){
        retArr[retCurr] = a[aCurr];
        retCurr +=1;
        aCurr +=1;
      }
      return retArr;
    }
    if(a[aCurr] <= b[bCurr]){
      retArr[retCurr] = a[aCurr];
      aCurr +=1;
      retCurr +=1;
    }
    // System.out.println(aCurr);
    // System.out.println(bCurr);
    // System.out.println(a[aCurr]);
    // System.out.println(b[bCurr]);
    if (aCurr >= a.length){
      for (int i=0;bCurr <b.length;i++){
        retArr[retCurr] = b[bCurr];
        retCurr +=1;
        bCurr +=1;
      }
      return retArr;
    }
    if (bCurr >= b.length){
      for (int i=0;aCurr <a.length;i++){
        retArr[retCurr] = a[aCurr];
        retCurr +=1;
        aCurr +=1;
      }
      return retArr;
    }
    if(a[aCurr] >= b[bCurr]){
      retArr[retCurr] = b[bCurr];
      bCurr +=1;
      retCurr +=1;
    }
  }
    return retArr;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
     int[] arr1= new int[arr.length/2];
      int[] arr2 = new int[arr.length-arr1.length];
        int Cur = arr1.length;
       for(int i =0; i< arr1.length; i++){
             arr1[i] = arr[i]; }
       for(int i =0;i <arr2.length; i++){
        arr2[i] = arr[Cur];
          Cur +=1;}
     while (arr1.length > 1){
       sort(arr1);
       merge(arr1, arr2);
       //printArray(arr1);
       //printArray(arr2);
       //sort(arr1);
     }
    // printArray(arr2);
     while (arr2.length>1){
       //printArray(arr1);
      // printArray(arr2);
       sort(arr2);
     }
    // printArray(arr1);
     //printArray(arr2);
 return merge(arr1,arr2);

  }//end sort()
  public static void split(int[] arr){
    int[] arr1= new int[arr.length/2];
     int[] arr2 = new int[arr.length-arr1.length];
       int Cur = arr1.length;
      for(int i =0; i< arr1.length; i++){
            arr1[i] = arr[i]; }
      for(int i =0;i <arr2.length; i++){
         arr2[i] = arr[Cur];
         Cur +=1;}
  }



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
  public static void main( String [] args ) {

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
      printArray( merge(arr4,arr2) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~

      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
