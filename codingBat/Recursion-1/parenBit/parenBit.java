public class parenBit{
  public static String parenBit(String str){
    if (str.length() <1){
      return str;
    }
    else if (str.substring(0,1).equals(")")){
      return ")";
    }
    else if(str.substring(0,1).equals("(")){
      return "(" + str.substring(1,2) + parenBit(str.substring(0,1) + str.substring(2));
    }
    else{
      return parenBit(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(parenBit("xyz(abc)123"));
    System.out.println(parenBit("x(hello)"));
    System.out.println(parenBit("(xy)1"));
  }

}
