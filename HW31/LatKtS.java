// Shafali Gupta
//APCS2 pd 01
//HW31 - Stack: What is it Good For?
//2018-04-10
/*****************************************************
 * skeleton for class LatKtS
 * Driver class for Latkes.
 * Uses a stack to reverse a text string, check for sets of matching parens.
 *****************************************************/


public class LatKtS
{

  /**********************************************************
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **********************************************************/
  public static String flip( String s )
  {
    Latkes _stack= new Latkes(s.length());
    for (int i = 0; i<s.length();i++){
      _stack.push(s.substring(i, i+1));
    }
    String retStr= "";
    while(!(_stack.isEmpty())){
    retStr+= _stack.pop();
    }
    return retStr;
  }//end flip()


  /**********************************************************
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **********************************************************/
  public static boolean allMatched( String s )
  {
    if (s.length()%2 == 1){
      return false;
    }
   Latkes or = new Latkes(s.length());
   or.push(s.substring(0,1));
   for(int i = 1; i < s.length(); i ++){
     if (s.substring(i,i+1).equals("}")){
       String temp = or.pop();
       if (!(temp.equals("{")))
         return false;
     }
     else if (s.substring(i,i+1).equals("]")){
       String temp = or.pop();
       if (!(temp.equals("[")))
         return false;
     }
     else if(s.substring(i,i+1).equals(")")){
       String temp = or.pop();
       if (!(temp.equals("(")))
         return false;
     }
     else{
       or.push(s.substring(i,i+1));
     }
   }
   return or.isEmpty();
  }//end allMatched()


  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class LatKtS
