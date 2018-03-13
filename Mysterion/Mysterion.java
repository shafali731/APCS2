//Shafali Gupta
//APCS2 pd02
//HW16 -- About Face
//2018-03-08
/* Partition sorter
This method takes all of the numbers less than the number at arr[c] and outs them to the left of it. It returns the index of
the number initially at arr[c]
*/
public class Mysterion{
public static int mystery(int a, int b, int c, int[] arr){
  System.out.println(toString(arr));
	int v = arr[c];
  arr = swap(c,b,arr);
	int s;
	System.out.println(toString(arr));
	s=a;

	for (int i =a; i< b; i++){
	    if (arr[i] < v){
		swap(s,i,arr);
		System.out.println(toString(arr));
		s+=1;
	    }
	}
	swap(b,s,arr);
	System.out.println(toString(arr));
	return s;
    }

    //swap helper method
static int[] swap(int a, int b, int[] arr){
	int temp=arr[a];
	arr[a]=arr[b];
	arr[b]=temp;
	return arr;
    }

    //toString
public static String toString(int[] arr){
	String retStr="[";
	for (int i=0; i< arr.length; i++){
	    retStr+= arr[i]+",";
	}
	retStr+= "]";
	return retStr;

    }

    public static void main (String[] args){
	int[] ahhh = new int[] {7,1,5,12,3};
	System.out.println(mystery(0,1,2,ahhh));

	System.out.println("---------------------");
	//slightly altered
	int[] ohNo = {1,7,5,12,3};
	System.out.println(mystery(0,4,2,ohNo));
	//System.out.println(toString(test2));


	System.out.println("-----------------------");
	//slightly altered
	int[] urg =  {1,5,7,12,3};
	System.out.println(mystery(0,4,2,urg));
	//System.out.println(toString(test3));


	System.out.println("-------------------------");
	//slightly altered
	int[] angrey = {1,7,5,3,12};
	System.out.println(mystery(0,4,2,angrey));
	//System.out.println(mystery(1,2,3,test4));


	System.out.println("----------------------------");
	//sorted
	int[] huh = {1,3,5,7,12};
	System.out.println(mystery(0,4,2,huh));
	//System.out.println(toString(test5));

	System.out.println("-------------------------------");
	//longer?
	int[] done = {1,3,5,7,12,2};
	System.out.println(mystery(0,5,2,done));
	//System.out.println(toString(test6));
System.out.println("TESTS");
  int[] a = {7,1,5,3,2};
  System.out.println(mystery(2,4,3, a));

    }
  }
