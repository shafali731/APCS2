public class stringClean{
  public static String stringClean(String str){
    if(str.length()<3){
      return str;
    }
    else if(str.substring(0,1).equals(str.substring(2,3))){
      return str.substring(2,3) + stringClean(str.substring(1));
    }
    else{
      return str.substring(0,1) + stringClean(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(stringClean("yyzzza"));//yza
    System.out.println(stringClean("abbbcdd"));// abcd
    System.out.println(stringClean("Hello"));// Helo

  }
}
