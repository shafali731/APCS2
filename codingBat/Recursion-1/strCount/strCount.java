public class strCount{
  public static int strCount(String str, String sub){
    if ( str.length() < sub.length()){
      return 0;
    }
    else if (str.substring(0,sub.length()).equals(sub)){
      return 1 + strCount(str.substring(sub.length()), sub);
    }
    else{
      return strCount(str.substring(1), sub);
    }
  }
  public static void main(String[] args) {
    System.out.println(strCount("abathbat", "bat"));
    System.out.println(strCount("catcowcat", "cat"));
    System.out.println(strCount("catcowcat", "cow"));
    System.out.println(strCount("catcowcat", "dog"));
    //strCount("catcowcat", "cat") → 2
    //strCount("catcowcat", "cow") → 1
    //strCount("catcowcat", "dog") → 0
  }
}
