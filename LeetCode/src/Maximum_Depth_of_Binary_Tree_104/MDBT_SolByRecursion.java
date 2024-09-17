package Maximum_Depth_of_Binary_Tree_104;

public class MDBT_SolByRecursion {
    public static int maxDepth(TreeNode root) {
    	if(root == null)
    		return 0;
    	
    	System.out.println(root.left);
    	
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
