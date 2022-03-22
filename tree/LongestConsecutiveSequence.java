package tree;

import base.Node;

public class LongestConsecutiveSequence {
    public int longestConsecutive(Node root) {
        return recursiveHelper(root, null, 0);// parent node is null
    }

    public int recursiveHelper(Node curr, Node parent, int depth) {
    	if (curr == null) {
    		return 0;
    	} 
    	int currDepth = 0;// reset
    	if (parent != null && parent.id + 1 == curr.id) {
    		currDepth = depth + 1;
    	} else {
    		currDepth = 1;// set
    	}
    	return Math.max(currDepth, Math.max(recursiveHelper(curr.left, curr, currDepth), recursiveHelper(curr.right, curr, currDepth)));//max of three
    }
}

