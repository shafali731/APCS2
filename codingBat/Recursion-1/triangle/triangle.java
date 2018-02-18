public class triangle{
  public static int triangle(int rows){
    if ( rows == 0){
      return 0;
    }
    else if (rows == 1){
      return 1;
    }
    else{
      return rows + triangle(rows -1)  ;
    }
  }
  public static void main(String[] args) {
    System.out.println(triangle(2));
    System.out.println(triangle(4));
  }
}
