package easy.s100;

public class s100 {
    public static void main(String[] args)
    {

    }
    public static boolean isSameTree(TreeNode p , TreeNode q)
    {
        return isSame(p ,q);
    }
    public static boolean isSame(TreeNode l , TreeNode r){
        if(l == null && r == null) return true ;
        else if(l == null || r == null )return false ;
        else {
            return ( l.val == r.val && isSame(l.left ,r.left) && isSame(l.right , r.right));
        }
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
