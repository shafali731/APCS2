public class changePi{
  public static String changePi(String str){
    if (str.length() <2){
    return str;
  }
     else if (str.equals("pi")){
       return "3.14";
     }
     else if(str.substring(0,2).equals("pi")){
       return "3.14" + changePi(str.substring(2));
     }
     else{
       return str.substring(0,1) + changePi(str.substring(1));
     }
   }
  public static void main(String[] args) {
    System.out.println(changePi("pi"));
    System.out.println(changePi("xpix"));
    System.out.println(changePi("pipi"));
    System.out.println(changePi("pip"));
    System.out.println(changePi("pihgijjipi"));
    System.out.println(changePi("pifffpigggpi"));

  }
}
