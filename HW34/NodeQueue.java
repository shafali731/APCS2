//Shafali Gupta
//APCS2 pd 01
//HW34 - The English Do Not Wait In Line
//2018-04-16
public class NodeQueue<T> implements Queue<T>
{
  //the last element is all the way on the LEFT while the front is the RIGHT
     private LLNode<T> _front;
     private LLNode<T> _last;

    public NodeQueue()
	{
	    _front = _last = null;
	}

    public void enqueue( T value )
    {

	if ( isEmpty() ) {
	    _front = _last = new LLNode<T>( value, null );
	}
	else {
	    _last.setNext( new LLNode<T>( value, null ) );
	    _last = _last.getNext();
	      }
  }

  public T dequeue()
    {
	T temp = _front.getValue();
	_front = _front.getNext();
	if ( isEmpty() )
	    _last = null;
	return temp;
    }

    public T peekFront()
    {
	return _front.getValue();
    }


    public boolean isEmpty()
    {
	return _front == null;
    }

    public String toString()
    {
	String retStr = "";
	LLNode<T> temp = _front;
	while ( temp != null ) {
	    retStr += temp.getValue() + " ";
	    temp = temp.getNext();
	}
	return retStr;
    }

    public static void main( String[] args )
    {
	Queue<String> thing = new NodeQueue<String>();
//enqueue
	thing.enqueue("hello");
	thing.enqueue("my");
	thing.enqueue("name");
	System.out.println( thing );
  //dequeue
	System.out.println( thing.dequeue() );
	System.out.println( thing.dequeue() );
	System.out.println( thing.dequeue() );

	System.out.println( thing.dequeue() );

  }
}
