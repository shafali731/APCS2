//Team AYO - Shafali Gupta and Bing Li
//Shafali Gupta
//APCS2 pd 01
//HW 35- Encapsulating ArrayList in queue
//2018-04-16
import java.util.ArrayList;
public class AlQueue<Quasar> implements Queue<Quasar>{
//  private Quasar _head;
//  private Quasar _tail;
  private int _size= 0;
  public ArrayList<Quasar> test;
  public AlQueue(){
    //_head=_tail=null
    test = new ArrayList<Quasar>();
    _size = 0;
  }

  public  boolean isEmpty(){
    return _size==0;
  }

  public Quasar dequeue(){
    _size --;
    return test.remove(0);
  }
  public void enqueue(Quasar x){
    test.add(x);
    _size++;
  }
  public Quasar peekFront(){
    return test.get(0);
  }
  public String toString(){
    return test.toString();
  }

  public static void main(String[]args){
    Queue<String> a = new AlQueue<String>();
    a.enqueue("I");
    a.enqueue("used");
    a.enqueue("to");
    a.enqueue("rule");
    a.enqueue("the");
    a.enqueue("world");
    System.out.println(a);
    System.out.println(a.peekFront());
    a.dequeue();
    a.dequeue();
    a.dequeue();
    a.dequeue();
    a.dequeue();
    System.out.println(a);
    a.dequeue();
    System.out.println(a.isEmpty());
    System.out.println(a);
    System.out.println("the next thing should give an error");
    a.dequeue(); //should give error

  }
}
