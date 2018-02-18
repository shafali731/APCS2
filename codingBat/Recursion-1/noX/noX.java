public class noX{
  public static String noX(String str){
    if (str.length()<1){
      return str;
    }
    else if (str.substring(0,1).equals("x")){
      return noX(str.substring(1));
    }
    else{
      return str.substring(0,1) + noX(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(noX("abcxdfxh"));
  }
}
