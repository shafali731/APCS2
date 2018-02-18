public class pairStar{
  public static String pairStar(String str){
    if (str.length()<2){
      return str;
    }
    else if(str.substring(0,1).equals(str.substring(1,2))){
      return str.substring(0,1) + "*" + pairStar(str.substring(1));
    }
    else {
      return str.substring(0,1) + pairStar(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(pairStar("aabbcc"));
  }
}
