/**
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.


Example 1:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:

Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:

Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.


Constraints:
The number of the nodes in the list is in the range [0, 104].
-105 <= Node.val <= 105
pos is -1 or a valid index in the linked-list.
 

Follow up: Can you solve it using O(1) (i.e. constant) memory?
 */

package Linked_List_Cycle_141;
/*
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class ListNode{
	int val;
	ListNode next;
	
	public ListNode (int x){
		val = x;
		next = null;
	}

}

public class LLC_141_Day01 {
	public static void main(String args[]) {
		ListNode listNode1 = new ListNode(3);
		listNode1.next = new ListNode(2);
		listNode1.next.next = new ListNode(0);
		listNode1.next.next.next = new ListNode(-4);
		
		ListNode listNode2 = new ListNode(1);
		listNode2.next = new ListNode(2);
		
		ListNode listNode3 = new ListNode(1);
		
		boolean ans1 = hasCycle(listNode1, 1);
		System.out.println(ans1);
		boolean ans2 = hasCycle(listNode2, 0);
		System.out.println(ans2);
		boolean ans3 = hasCycle(listNode3, -1);
		System.out.println(ans3);
		
		
	}
	
    public static boolean hasCycle(ListNode head, int pos) {
    	int idx = 0;

        while(null != head) {
        	idx++;
        	head = head.next;
        }
        
        System.out.println(idx);
        if(idx < 2) {
        	return false;
        }
        	
    	return true;
    }
}
