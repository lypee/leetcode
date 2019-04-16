package easy.s897;

public class s897 {
    public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }



    public TreeNode increasingBST(TreeNode root, TreeNode tail) {
        if (root == null) return tail;
        TreeNode res = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, tail);
        return res;
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