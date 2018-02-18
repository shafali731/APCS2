public class countX{
  public static int countX(String str){
    if (str.equals("")){
      return 0;
    }
    else if (str.substring(0,1).equals("x")){
      return 1 + countX(str.substring(1));
    }
    else{
      return countX(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(countX("x"));
    System.out.println(countX("xXXfx"));
    System.out.println(countX("xxxxxfffffffffffffff"));
  }
}
