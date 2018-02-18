public class countHi{
  public static int countHi(String str){
    if (str.length()<2){
      return 0;
    }
    else if (str.substring(0,2).equals("hi")){
      return 1+ countHi(str.substring(2));
    }
    else{
      return countHi(str.substring(1));
    }
  }
  public static void main(String[] args) {
    System.out.println(countHi("xxhixx"));
    System.out.println(countHi("xhixhixhi"));
    System.out.println(countHi("hi"));
  }
}
