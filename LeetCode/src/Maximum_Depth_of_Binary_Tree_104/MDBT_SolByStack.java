package Maximum_Depth_of_Binary_Tree_104;

import java.util.Stack;

public class MDBT_SolByStack {
    public static int maxDepth_Stack(TreeNode root) {
    	if(root == null) {
    		return 0;
    	}
    	int maxAns = 0;
    	
    	Stack<TreeNode> stackNdVal = new Stack<>();
    	Stack<Integer> depthNdVal = new Stack<>();
    	
    	stackNdVal.push(root);
    	depthNdVal.push(1);
    	
    	while(stackNdVal.isEmpty()) {
    		TreeNode TN = stackNdVal.pop();
    		int depth = depthNdVal.pop();
    		
    		maxAns = Math.max(maxAns, depth);
    		if(TN.left != null) {
    			stackNdVal.push(TN.left);
    			depthNdVal.push(depth + 1);
    		}
    		
    		if(TN.right != null) {
    			stackNdVal.push(TN.right);
    			depthNdVal.push(depth + 1);
    		}
    	}
    	
    	return maxAns;
    }
}
