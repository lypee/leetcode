package easy.s872;

import java.util.ArrayList;
import java.util.List;

public class s872 {


    public static void main(String[] args) {

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       List<Integer> LnodeList = new ArrayList<>();
       List<Integer> RnodeList = new ArrayList<>();
//        LinOrderTraversel(root1);
//        RinOrderTraversel(root2);
        inOrderTraverse1(root1 , LnodeList);
        inOrderTraverse1(root2 , RnodeList);
        if (LnodeList.size() != RnodeList.size()) return false;
        else {
            for (int i = 0; i < LnodeList.size(); i++) {
                if (LnodeList.get(i) != RnodeList.get(i)) return false;
            }

        }
        return true;
    }
    public static void inOrderTraverse1(TreeNode root , List<Integer> nodeList) {
        if (root != null) {
            if(root.left == null && root.right == null) {
                nodeList.add(root.val) ;
            }else{
                if(root.left != null)
                inOrderTraverse1(root.left , nodeList);
                if(root.right != null)
                inOrderTraverse1(root.right ,nodeList);
            }
        }
    }
}
//    //中序遍历左
//    public static void LinOrderTraversel(TreeNode node)
//    {
//        LinOrderTraversel(node.left);
//        if(node.left == null && node.right == null){
//            LnodeList.add(node.val) ;
//        }
//        LinOrderTraversel(node.right);
//    }
//    public static void RinOrderTraversel(TreeNode node)
//    {
//        RinOrderTraversel(node.left);
//        if(node.left == null && node.right == null) {
//            RnodeList.add(node.val) ;
//        }
//        RinOrderTraversel(node.right);
//    }
//}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}