/*****************************************************
 * class DLLNode
 * Implements a doubly-linked node,
 * for use in lists and other collection classes.
 * Stores data of type String
 *****************************************************/

public class DLLNode<T>
{
  private T _cargo;    //cargo may only be of type String
  private DLLNode<T> _nextNode, _prevNode; //pointers to next, prev DLLNodes

  //YOUR IMPLEMENTATION HERE...
  public DLLNode(T cargo, DLLNode prevNode, DLLNode nextNode){
      _cargo = cargo;
      _prevNode = prevNode;
      _nextNode = nextNode;
      }
  public T getCargo() {
      return _cargo;
}

  public DLLNode getNext() {
      return _nextNode;
}

  public DLLNode getPrev(){
      return _prevNode;
      }
  public T setCargo( T newCargo ) {
      T a = getCargo();
      _cargo = newCargo;
      return a;
      }

  public DLLNode<T> setNext( DLLNode newNext ) {
     DLLNode<T> a = getNext();
    _nextNode = newNext;
    return a;
      }

  public DLLNode<T> setPrev( DLLNode newPrev ) {
      DLLNode<T> a = getPrev();
      _prevNode = newPrev;
      return a;
            }
  public String toString() {
      return _cargo.toString();
          }
  public static void main(String[] args) {
      DLLNode first = new DLLNode( "I", null, null );
      first.setPrev(new DLLNode("wowie", null, first));
      first.setNext( new DLLNode( "am", null, first ) );
      first.getNext().setNext( new DLLNode( "wierd", first.getNext(), null ) );
      DLLNode it = first.getPrev();
      while (it != null) {
              System.out.println(it);
              it = it.getNext();
            }
    }

}//end class DLLNode
