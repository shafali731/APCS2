public class changeXY{
  public static String changeXY(String str){
    if (str.length()<1){
      return str;
    }
    else if (str.substring(0,1).equals("x")){
      return "y" + changeXY(str.substring(1));
    }
    else{
      return str.substring(0,1) + changeXY(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(changeXY("codex"));
    System.out.println(changeXY("xxhixx"));
    System.out.println(changeXY("xhixhix"));
  }
}
