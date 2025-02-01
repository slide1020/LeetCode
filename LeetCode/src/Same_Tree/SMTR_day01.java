/**
 * 100. Same Tree

Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Input: p = [1,2,3], q = [1,2,3]
Output: true

Input: p = [1,2], q = [1,null,2]
Output: false

Input: p = [1,2,1], q = [1,1,2]
Output: false

Constraints:
The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
 */


/* public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
 */
package Same_Tree;

public class SMTR_day01 {

	public static void main(String[] args) {
   
	}
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //System.out.println("p.val : " + p + "/ q :  " + q);
    	// if p is null and q is null end.
        if(p == null && q == null) {
        	return true; 
        }
        
        // if p or q is null, then p!=q. so return false.
        if(p == null || q == null) {
        	return false;
        }
 
        // if p and q is same. keep going
        if(p.val == q.val) {
        	return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        
        return false;
    }

}
