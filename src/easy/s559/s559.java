package easy.s559;

import java.util.List;

public class s559 {

    public static int maxDepth(Node root ){
        if(root == null ) return 0 ;
        int max= 0 ;
        for(Node child : root.children)
        {
            int value = maxDepth(child) ;
            max = Math.max(value , max ) ;
        }
        return max +1 ;
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
