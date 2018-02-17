// Shafali Gupta
//APCS2 - pd 01
// HW 07 -- A Man, A Plan, A Canal: Panama!
// 2018-02-14

public class Resrever{
  public static String nRun(String a){
    String retStr= "";
    for( int i = a.length()-1; i>=0; i--){
      retStr += a.substring(i, i+1);
        }
    return retStr;
  }
//static String holder = "";
  public static String lognRun(String a){
    String holder = "";
    if (a.length() == 1){
      holder += a;
      return holder;
    }
    int half = a.length()/2;
    String leftS= "";
    String rightS= "";
    String temp= "";
    for( int i=0; i<a.length(); i++ ) {
     if ( i < half )
       leftS += a.substring(i, i+1);
     else
       rightS +=a.substring(i, i+1);
   }
   // temp = leftS;
   // leftS = rightS;
   // rightS = temp;
return thing(lognRun(leftS), lognRun(rightS));
  }

   public static String thing(String a, String b){
     String temp = "";
     temp = a;
     a = b;
      b= temp;
      return a+b;
  }
public static void main(String [] args){
  System.out.println(nRun("stressed"));
  // String temp= "";
  // String a = "hop";
  // temp = a;
  // System.out.println(temp);
  System.out.println(lognRun("hop"));
  System.out.println(lognRun("stressed"));

}
}
