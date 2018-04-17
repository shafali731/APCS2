//Shafali Gupta
//APCS2 pd 01
//HW32 - Leon Leonwood Stack
//2018-04-12

/*****************************************************
 * class Stckr
* driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 *****************************************************/

public class Stckr
{
public static void main( String[] args )
{
  /*
  Stack<String> cakes = new ALStack<String>();
  System.out.println(cakes.isEmpty()); //true
  cakes.push("Three");
  cakes.push("little");
  cakes.push("birds");
  cakes.push("sat");
  cakes.push("on");
  cakes.push("my");
  cakes.push("window");
  System.out.println("peek :" + cakes.peek()); //window
  System.out.println("pop: " + cakes.pop()); //window
  System.out.println("peek: " + cakes.peek()); //my
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: " +cakes.peek()); //on
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: " + cakes.peek()); //sat
  System.out.println("pop:" + cakes.pop());
  System.out.println("peek: " +cakes.peek()); //birds
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: " + cakes.peek()); //little
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: " + cakes.peek()); //Three
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: "  + cakes.peek()); //null
  */

  Stack cakes = new LLStack();
  System.out.println(cakes.isEmpty()); //true
  cakes.push("Three");
  cakes.push("little");
  cakes.push("birds");
  cakes.push("sat");
  cakes.push("on");
  cakes.push("my");
  cakes.push("window");
  System.out.println("peek :" + cakes.peek()); //window
  System.out.println("pop: " + cakes.pop()); //window
  System.out.println("peek: " + cakes.peek()); //my
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: " +cakes.peek()); //on
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: " + cakes.peek()); //sat
  System.out.println("pop:" + cakes.pop());
  System.out.println("peek: " +cakes.peek()); //birds
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: " + cakes.peek()); //little
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: " + cakes.peek()); //Three
  System.out.println("pop: " + cakes.pop());
  System.out.println("peek: "  + cakes.peek()); //null




}

}//end class
