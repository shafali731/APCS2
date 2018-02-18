public class count7{
  public static int count7(int n){
     if (n==0){
        return 0; }
    else if (n %10 == 7){
      return 1 + count7(n/10);
    }
    else {
      return 0 + count7(n/10);
    }
  }
  public static void main(String[] args) {
    System.out.println(count7(87));
    System.out.println(count7(701118));
    System.out.println(count7(787));
  }
}
