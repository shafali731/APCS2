public class array6{
  public static boolean array6(int[] nums, int index){
    if(index>nums.length-1){
      return false;
    }
    else if(nums[index] == 6){
      return true;
    }
    else{
      return array6(nums, index+1);
    }
  }
  public static void main(String[] args) {
    int[] n = new int[3];
    n[0]= 1;
    n[1]= 2;
    n[2]= 6;
    System.out.println(array6(n, 0));
  }
}
