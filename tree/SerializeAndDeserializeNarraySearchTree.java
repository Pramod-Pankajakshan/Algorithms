package tree;

import java.util.*;


public class SerializeAndDeserializeNarraySearchTree {
 public static void main(String[] args) {
	 SerializeAndDeserializeNarraySearchTree s= new SerializeAndDeserializeNarraySearchTree();
	 Node n63 = s.new  Node();
	 n63.val=311;	 
	 List<Node> l23= new ArrayList<>();
	 l23.add(n63);
	 Node n3 = s.new  Node();
	 n3.val=7;
	 Node n31 = s.new  Node();
	 n31.val=9;
	 Node n32 = s.new  Node();
	 n32.val=0;	 
	 List<Node> l3= new ArrayList<>();
	 l3.add(n3); l3.add(n31); l3.add(n32);
	 Node n = s.new  Node();
	 n.val=2;
	 n.children=l3;
	 Node n1 = s.new  Node();
	 n1.val=3;
	 Node n2 = s.new  Node();
	 n2.val=4;	 n2.children=l23;
	 List<Node> l= new ArrayList<>();
	 l.add(n); l.add(n1); l.add(n2);
	 Node root = s.new  Node();
	 root.val=1;root.children=l;
	
	 s.serialize(root);//incomplete
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
	    // still use level order
	    // Encodes a tree to a single string.
	    public String serialize(Node root) {
	        if (root == null)   return null;
	        StringBuilder sb = new StringBuilder();
	        Queue<Node> queue = new LinkedList<>();
	        sb.append(root.val);
	        sb.append("#");
	        queue.add(root);
	        while (!queue.isEmpty()) {
	            int size = queue.size();
	            for (int i = 0; i < size; i++) {
	                Node curr = queue.poll();
	                if (curr != null) {
	                    List<Node> children = curr.children;
	                    if (children == null || children.size() == 0) {
	                        sb.append("null");
	                    } else {
	                        for (Node c : children) {
	                            sb.append(c.val);
	                            sb.append(",");
	                            queue.add(c);
	                        }
	                    }
	                    sb.append("#");
	                }
	            }
	            System.out.println(sb.toString());
	        }
	     //   System.out.println(sb.toString());
	        return sb.toString().substring(0, sb.length() - 1);
	    }

	    // Decodes your encoded data to tree.
	    
	     // Get the string
	     //split into #
	     //assign root as first
	     //add elements by splitting commas
	    // add them to 
	    public Node deserialize(String data) {
	        if (data == null)   return null;
	        Queue<Node> queue = new LinkedList<>();
	        String[] elements = data.split("#");
	        Node root = new Node(Integer.valueOf(elements[0]), null);
	        queue.add(root);
	        for (int i = 1; i < elements.length; i++) {// start from 1- so its ahead
	            Node parent = queue.poll();
	            String[] kids = elements[i].split(",");
	            List<Node> nodelist = new ArrayList<>();
	            for (String kid : kids) {
	                if (kid.length() == 0)  continue;
	                if (kid.equals("null")) continue;
	                Node kidNode = new Node(Integer.valueOf(kid), null);
	                nodelist.add(kidNode);
	                queue.add(kidNode);
	            }
	            parent.children = nodelist;
	        }
	        return root;
	    }
	}
	
	


