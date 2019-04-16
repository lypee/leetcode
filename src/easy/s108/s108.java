package easy.s108;

public class s108 {
    public static TreeNode srotedArrayToBST(int[] nums)
    {
    if(nums.length == 0 ) return null ;
    TreeNode node = toBTS(nums , 0 , nums.length-1) ;
    return node ;
    }
    public static TreeNode toBTS(int[] nums  , int low  , int hight){
        if(low > hight) return null ;
        int mid = (low+hight) /2 ;
        TreeNode node = new TreeNode(nums[mid]) ;
        node.left=toBTS(nums ,low , mid -1 ) ;
        node.right = toBTS(nums ,mid+1 , hight);
        return node ;
    }
}

class TreeNode{
    int val ;
     TreeNode left ;
    TreeNode right ;
    TreeNode(int n)
    {
        this.val = n ;
    }
}