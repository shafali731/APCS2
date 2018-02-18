public class endX{
  public static String endX(String str){
    if (str.length()<1){
      return str;
    }
    else if (str.substring(0,1).equals("x")){
      return endX(str.substring(1)) + "x";
    }
    else{
      return str.substring(0,1) + endX(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(endX("xxre"));
    System.out.println(endX("xxhixx"));
  }
}
