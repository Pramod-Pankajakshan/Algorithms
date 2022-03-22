package tree;

import base.CreateTree;
import base.Node;

public class CountNodesOfCompleteBST {
public static void main(String arg[]){

	System.out.println(countNodes(new CreateTree().createTree2()));

}


  static  int height(Node root) {
        return root == null ? -1 : 1 + height(root.left);
    }
    public static int countNodes(Node root) {
        int h = height(root);
        return h < 0 ? 0 :
               height(root.right) == h-1 ? (1 << h) + countNodes(root.right)
                                         : (1 << h-1) + countNodes(root.left);
    }
}




