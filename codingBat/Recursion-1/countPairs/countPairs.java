public class countPairs{
  public static int countPairs(String str){
    if (str.length()<3){
      return 0;
    }
    else if (str.substring(0,1).equals(str.substring(2,3))){
      return 1 + countPairs(str.substring(1));
    }
    else{
      return countPairs(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(countPairs("axa"));//1
    System.out.println(countPairs("axax"));//2
    System.out.println(countPairs("axbx"));//1

  }
}
