//Shafali Gupta
//APCS2 pd01
//HW33 - what a racket
//2019-04-12

/*****************************************************
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ____ by ____
 * b/c ...
 ******************************************************/

public class Scheme
{
  /******************************************************
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   ******************************************************/
  public static String evaluate( String expr )
  {
    String retStr= "";
    int r= 0;
    Stack<String> _stack = new ALStack<String>();
    String[] exprArr = expr.split("\\s+");
    for (int i = 0; i<exprArr.length; i++){
      System.out.println(exprArr[i] + ",");
    }
    for(int i=0; i<exprArr.length; i++){
      if (exprArr[i].equals("(")){
        if (exprArr[i+1].equals("+")){
          System.out.println(isNumber(exprArr[i+2]));
          while (isNumber(exprArr[i+2])){
            System.out.println( exprArr[i+2]);
            _stack.push(exprArr[i+2]);
            i++;
          }
          System.out.println(_stack);
          retStr = unload(1, _stack);
          r+= Integer.parseInt(retStr);
          //i++;
          //System.out.println(retStr);
          System.out.println( r);
      }
      System.out.println(i);
      if (exprArr[i+1].equals("-")){
        while (isNumber(exprArr[i+1])){
          _stack.push(exprArr[i+1]);
          i++;
        }
        retStr = unload(2, _stack);
        r+= Integer.parseInt(unload(2, _stack)) ;
      }
      else if (exprArr[i+1].equals("*")){
        while (isNumber(exprArr[i+1])){
          _stack.push(exprArr[i+1]);
          i++;
        }
        retStr = unload(3, _stack);
        r+= Integer.parseInt(unload(3, _stack)) ;
      }
    }
    else if(exprArr[i] == "("){
        evaluate(expr.substring(i));
    }
  }
System.out.println("r is " + r);
    return Integer.toString(r);
  }//end evaluate()


  /******************************************************
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   ******************************************************/
  public static String unload( int op, Stack<String> numbers )
  {
    int ret = 0;
    if (op == 1){
      while(!(numbers.isEmpty())){
        ret += Integer.parseInt(numbers.pop());
      }
      return String.valueOf(ret);
    }
    else if (op ==2){
      while(!(numbers.isEmpty())){
          ret -= Integer.parseInt(numbers.pop());
    }
    return String.valueOf(ret);

    }
    else {
        ret= 1;
        while(!(numbers.isEmpty())){
        ret *= Integer.parseInt(numbers.pop());
    }
    return String.valueOf(ret);

  }
    //System.out.println("ret = "+ ret);
    //System.out.println(String.valueOf(ret));
  //  return String.valueOf(ret);
    }//end unload()



  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
	}
  catch( NumberFormatException e ) {
  return false;
	}
  }



  //main method for testing
  public static void main( String[] args )
  {

      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );

      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main

}//end class Scheme
