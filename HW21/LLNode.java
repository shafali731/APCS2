/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class LLNode
{
    //instance vars
    private String cargo;
    private LLNode link;

    // constructor
    public LLNode(){
      this.cargo = "";
      this.link = null;
    }
    public LLNode(String car, LLNode nextNode) {
   	this.cargo = car;
   	this.link = nextNode;
       }

    //--------------v  ACCESSORS  v--------------
    public String getCargo()
    {
      return cargo;
    }

    public LLNode getNext()
    {
      return link;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo(String str)
    {
      cargo = str;
      return cargo;
    }

    public LLNode setNext(LLNode n)
    {
      link = n;
      return link;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString()
    {
      return "[" + cargo + " " + link  + "]";

    }


    //main method for testing
    public static void main( String[] args )
    {
	//PROTIP: try creating a few nodes: traversible, connected...
	//note anything notable as you develop and test...
	     LLNode a = new LLNode();
       LLNode b = new LLNode("world", a);
       LLNode c = new LLNode("hello", b);
       LLNode d = new LLNode("i'm tired", c);

       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
    }//end main

}//end class LLNode
