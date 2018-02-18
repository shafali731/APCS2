public class count8{
  public static int count8(int n){
    if (n ==0){
     return 0;
   }
   else if (n%10 ==8 && (n/10)%10 == 8 ){
     return 2 + count8(n/10);
   }
   else if(n%10 == 8){
     return 1 + count8(n/10);
   }
   else {
     return count8(n/10);
   }
  }
  public static void main(String[] args) {
    System.out.println(count8(8818));
    System.out.println(count8(8088));
    System.out.println(count8(818));
    System.out.println(count8(88788));
  }
}
