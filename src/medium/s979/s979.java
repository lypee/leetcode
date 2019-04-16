package medium.s979;

public class s979 {
    public static void main(String []args){

    }
    public static int distrubuteCoins(TreeNode root)
    {
         int l = dfs(root.left) ;
         int r = dfs(root.right) ;
         return l + r + root.val -1 ;
    }
    public static int dfs(TreeNode node){
        //子结点都不为空
        if(node == null  ) return 0 ;
        if(node.left != null && node.right != null ) {
            return dfs(node.left) + dfs(node.right) + node.val - 1;
        }else if(node.left != null) {
            //右孩子为空
            return dfs(node.left) + node.val -1 ;
        }else if(node.right != null)
        {
            return dfs(node.right) + node.val -1 ;
        }else  return 0;
    }
}
class TreeNode{
    int val ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(int x)
    {
        this.val = x ;
    }
}