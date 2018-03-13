/***
 Shafali Gupta
 APCS2 - pd01
 HW#17 -- SO SO Fast
 2017 -03 - 12
 **/

 /*
    If the y value is greater than half the length of the array, then limit the array to that paart and make the pivot there.
    Make the range for the entire array. Return the value at temp -1
 */

public class FastSelect
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o ) {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a ) {
    for ( int o : a )
	    System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d ) {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal ) {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------



  public static int quickSort( int arr[], int right, int left, int pivot)
  {
    int v = arr[pivot];

    swap( pivor, right, arr);
    int s = left;

    for( int i = left; i < right; i++ ) {
	    if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,right,arr);

    return s;
  }//end quickSort

public static int FastSelect(int arr[], int left, int right, int c){
  if (y> arr.length/2){
    int temp = arr.length - y;
    for (int i = temp; i< arr.length-1; i++){
      quickSort(arr, 0, i, temp);
    }
  }
  else {
  for (int i = arr.length-1; temp < i; i++) {
      partition(arr,0,i,temp);
}
return arr[temp];

  //main method for testing
  public static void main( String[] args )
  {
    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {5,4,17,9000,6};
    int[] arr5 = {3,0,16,599,1024};

    // run quickSort on each array,
    // holding a & b fixed, varying c...
    for( int testC = 0; testC < 5; testC++ ) {
	    System.out.println("arr1: ");
	    printArr(arr1);
	    System.out.println(quickSort(arr1,0,4,testC));
	    System.out.println("after quickSort w/ a=0,b=4,c="
                         + testC +"...");
	    printArr(arr1);
	    System.out.println("-----------------------");

	    // System.out.println("arr3:");
	    // printArr(arr3);
	    // quickSort(arr3,0,4,testC);
	    // System.out.println("after quickSort w/ a=0,b=4,c="
      //                    + testC +"...");
	    // printArr(arr3);
	    // System.out.println("-----------------------");
      //
	    // System.out.println("arr4:");
	    // printArr(arr4);
	    // quickSort(arr4,0,4,testC);
	    // System.out.println("after quickSort w/ a=0,b=4,c="
      //                    + testC +"...");
	    // printArr(arr4);
	    // System.out.println("-----------------------");
      //
	    // System.out.println("arr5:");
	    // printArr(arr5);
	    // quickSort(arr5,0,4,testC);
	    // System.out.println("after quickSort w/ a=0,b=4,c="
      //                    + testC +"...");
	    // printArr(arr5);
      int[] hello = {1,2,3,4,5};
        for (int i:hello) {
                System.out.println("The " + i + "th minimum: " + ymin(i,hello));
        }
        int[] bye = {8,2,6,1,4};
          for (int i:=bye) {
                  System.out.println("The " + i + "th minimum: " + ymin(i,bye));
          }
	    System.out.println("-----------------------");
    }
  }//end main

}//end class quickSort
