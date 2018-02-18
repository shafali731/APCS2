public class countHi2{
  public static int countHi2(String str){
    if (str.length() <2){
     return 0;
   }
   else if(str.length() > 2 && str.substring(0,3).equals("xhi")){
     return 0 + countHi2(str.substring(2));
   }
   else if(str.substring(0,2).equals("hi")){
     return 1 + countHi2(str.substring(1));
   }
   else{
     return countHi2(str.substring(1));
   }
  }
  public static void main(String[] args) {
    System.out.println(countHi2("abchi"));
    System.out.println(countHi2("abchixhihia"));
  }
}
