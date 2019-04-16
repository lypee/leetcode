package easy.s111;

public class s111 {
    public static void main(String [] args)
    {

    }
    public static int minDepth(TreeNode root ){
        if(root == null ) return 0 ;
       int l =  minDepth(root.left) ;
       int r = minDepth(root.right) ;
       return( Math.min(l ,r ) > 0 ? Math.min(l,r) : Math.max(l,r) ) +1 ;
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