//Shafali Gupta
//APCS pd1
//HW21c -- Rockin' Through The Night
//2018-03-19

public class LList implements List{
    private LLNode first;

    public LList(LLNode n){
	     first = n;
    }

    public boolean add(String str){
	LLNode s = new LLNode();
	LLNode curr = first;
	s.setCargo(str);
	int i = size();
	while ( i-1 > 0 ) {
	    curr = curr.getNext();
	    i--;
	}
	curr.setNext(s);
	return true;
    }

    public String get( int i){
	LLNode current = first;
	while ( i-1 > 0 ) {
	    current = current.getNext();
	    i--;
	}
	return current.getCargo();
    }

    public String set( int i, String x){

	LLNode current = first;
	while ( i-1 > 0 ) {
	    current = current.getNext();
	    i--;
	}
 	return current.setCargo(x);
    }

    public int size(){
	int length = 1;
	LLNode current = first;
	while(current.getNext() != null){
	    current = current.getNext();
	    length += 1;
	}
	return length;
    }

    public String toString()
    {
	return first.getCargo() + " " + first.getNext() ;
    }

    public static void main(String[] args){
	LLNode testN = new LLNode("I", null);

	LList testL = new LList(testN);
        testL.add("I");
	testL.add("am");
	testL.set(3, "tired");
	System.out.println(testL);
	System.out.println("Size: " + testL.size() + "\n" +
			   "3rd el: " + testL.get(3));
	testL.set(3, "happy");
	System.out.println(testL);


    }


}
