package easy.s101;

public class s101 {
public boolean isSymmetric(TreeNode root)
{
    if(root == null  ) return true ;
    return isMirror(root.left ,root.right);
}
public static boolean isMirror(TreeNode l ,TreeNode r)
{ if(r == null && l == null) return true ;
    if(l == null || r == null ) return false ;
    return (r.val == l.val) && isMirror(l.left,r.right) && isMirror(r.left ,l.right);

}
}
class TreeNode{
    int val ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(int n ){
        this.val = n ;
    }
}

