package medium.s515;

import medium.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class s515 {
    public static void main(String[]args)
    {

    }
    public List<Integer> largestValue(TreeNode root)
    {
        ArrayList<Integer> list  = new ArrayList<>() ;
        dfs(root, list, 0);
        return list ;
    }

    public void dfs(TreeNode root, List<Integer> res, int d) {
        {
            if(root == null)
            {
                return ;
            }
            if (d == res.size()) {
                res.add(root.val) ;
            }
            else{
                res.set(d, Math.max(res.get(d), root.val));
            }
            dfs(root.left, res, d + 1);
            dfs(root.right, res, d + 1);
        }
    }
}
