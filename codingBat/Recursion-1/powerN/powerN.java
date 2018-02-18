public class powerN{
  public static int powerN(int base, int n){
    if (n==0){
      return 1;
    }
    else{
      return base*powerN(base, n-1);
    }
  }
  public static void main(String[] args) {
    System.out.println(powerN(3, 3));
    System.out.println(powerN(3, 2));
    System.out.println(powerN(3,1));
  }
}
