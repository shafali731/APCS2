public class array11{
  public static int array11 (int[] nums, int index){
    if (index > nums.length-1){
      return 0;
    }
    if (nums[index] ==11){
      return 1 + array11(nums, index +1);
    }
    else{
      return array11(nums, index +1);
    }
  }
  public static void main(String[] args) {
    int[] nums= new int[3];
    nums[0] = 11;
    nums[1]=2;
    nums[2]=11;
   System.out.println(array11(nums, 0));
    //System.out.println(array11([11,2,3,4,11], 0));
  }
}
