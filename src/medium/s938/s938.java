package medium.s938;



public class s938 {
    public static void mian(String[] args)
    {

    }
    public static int rangeSumBST(TreeNode root , int L , int R)
    {
        if(root == null )
        {
            return  0 ;
        }
        else if(root.val < L)
        {
            return rangeSumBST(root.right , L ,R) ;
        }else if(root.val > R)
        {
            return rangeSumBST(root.left , L ,R);
        }
        return root.val + rangeSumBST(root.right  , L ,R) + rangeSumBST(root.left , L ,R) ;
    }
}
class TreeNode{
    int val ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(int val)
    {
        this.val = val ;
    }
}