package easy.s453;

public class s453 {
    public static void main(String[]args){
        int[] nums={1,2,3} ;
        System.out.println(minMoves(nums));
    }
    public static int minMoves(int[] nums){
        int count = 0 ;
        int minNumber = Integer.MAX_VALUE ;
        for(int i = 0 ; i< nums.length ; i++){
            count += nums[i];
            if(minNumber > nums[i]) minNumber = nums[i] ;
        }
        System.out.println(minNumber);
        int n = nums.length ;
        int dis = 0 ;
        //不能用for each
        for(int i = 0 ; i<nums.length ; i++)
        {
            System.out.println(minNumber + " , " + nums[i]);
            dis += nums[i] - minNumber ;
        }
        return dis ;

    }
}
