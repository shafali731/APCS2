public class allStar{
  public static String allStar(String str){
    if (str.length()<2){
      return str;
    }
    else{
      return str.substring(0,1) + "*" + allStar(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(allStar("hello"));
    System.out.println(allStar("abc"));
  }
}
