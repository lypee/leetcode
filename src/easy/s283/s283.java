package easy.s283;

public class s283 {
    public static void main(String[]args){
        int[] nums = {0,1};
        moveZeroes(nums);
        for(int n : nums){
            System.out.println(n);
        }
    }
    public static void moveZeroes(int[] nums){
        int n = nums.length ;
        int index = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[index] = nums[i] ;
                index ++ ;
            }
        }
        System.out.println(index);
        int i = 0;
        for( i = index ; i<nums.length ; i++){
            nums[i] = 0 ;
        }
//        System.out.println(i);
    }
}
