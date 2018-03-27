//Shafali Gupta
//APCS2 -  pd 01
//HW 25 - Generically Speaking
//2018 - 03 - 26

/*****************************************************
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 *****************************************************/

public class LList<T> implements List<T> //your List interface must be in same dir
{

    //instance vars
    private DLLNode<T> _head;
    private DLLNode<T> _tail;
    private int _size;

    // constructor -- initializes instance vars
    public LList( )
    {
	_head = null; //at birth, a list has no elements
  _tail = null;
	_size = 0;
    }


    //--------------v  List interface methods  v--------------

    public boolean add( T newVal )
    {
    DLLNode tmp = new DLLNode( newVal, _tail, null);
    if (size() == 0)
        _head = tmp;
    else
        _tail.setNext(tmp);
    _tail = tmp;
    _size++;
    return true;
    }

    public void add( int i, T s )
    {
      DLLNode first = _head;
      DLLNode newNode;
      System.out.println(size());
      if (i == size()) {
              add(s);
              return;
      }
      if (i > size())
              throw new IndexOutOfBoundsException();
      if (i == 0) {
              newNode = new DLLNode (s,null,first); //link it to the formerly next element
              first.setPrev(newNode);
              _head = newNode;
              return;
      }
      for (int node = 0; node < i-1; node++)
              if (first.getNext() != null)
                      first = first.getNext();
      newNode = new DLLNode (s,first,first.getNext());
      first.getNext().setPrev(newNode);
      first.setNext(newNode);
      _size++;
    }

    public T remove( int i ) {
      DLLNode<T> first = _head;
      DLLNode<T> deletedNode;
      if (i == 0) {
           deletedNode = first;
           first.getNext().setPrev(null);
           _head = first.getNext();
         }
      else{
           for (int node = 0; node < i-1; node++)
               first = first.getNext();
               deletedNode = first.getNext();
               first.setNext( deletedNode.getNext() );
               deletedNode.getNext().setPrev(first);
           }
       _size--;
       return deletedNode.getCargo();
	}



    public T get( int index )
    {
    if ( index < 0 || index >= size() )
            throw new IndexOutOfBoundsException();

    T retVal;
    DLLNode<T> tmp = _head;
    for( int i=0; i < index; i++ )
            tmp = tmp.getNext();

    retVal = tmp.getCargo();
    return retVal;
    }


    public T set( int index, T newVal )
    {
      if ( index < 0 || index >= size() )
              throw new IndexOutOfBoundsException();

      DLLNode<T> tmp = _head;

      for( int i=0; i < index; i++ )
              tmp = tmp.getNext();

      T oldVal = tmp.getCargo();

      tmp.setCargo( newVal );

      return oldVal;
    }


    public int size() { return _size; }

    //--------------^  List interface methods  ^--------------


    public String toString()
    {
      String retStr = "HEAD->";
      DLLNode<T> tmp = _head;
      while( tmp != null ) {
         retStr += tmp.getCargo() + "->";
         if (tmp.getNext() != null)
             if (tmp.getNext().getPrev() == tmp)
                 retStr += "<-";
                 tmp = tmp.getNext();
       }
       retStr += "NULL";
       return retStr;
    }


    //main method for testing
    public static void main( String[] args )
    {
	LList james = new LList();

	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("beat");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("a");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("need");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	james.add("I");
	System.out.println( james );
	System.out.println( "size: " + james.size() );

	System.out.println( "2nd item is: " + james.get(1) );

	james.set( 1, "got" );
	System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

	System.out.println( james );

	james.add(0, "Hey!");
	System.out.println("Added 'Hey!' at index 0:\n" + james);

	james.add(3, "you");
	System.out.println("Added 'you' at index 3:\n" + james);

	james.remove(3);
	System.out.println(james);

	james.remove(0);
	System.out.println(james);
    }

}//end class LList
