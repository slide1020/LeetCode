/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
package Add_Two_Numbers_2;


public class ATN_Solution_day01 {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode(2);
		ln1.next = new ListNode(4);
		ln1.next.next = new ListNode(3);
		
		ListNode ln2 = new ListNode(5);
		ln2.next = new ListNode(6);
		ln2.next.next = new ListNode(4);
		
		ListNode ans = addTwoNumbers(ln1, ln2);

		System.out.println("ans1");
		while(ans != null) {
			System.out.print(ans.val);
			ans = ans.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ans = new ListNode();
		int l1Num = 0;
		int l2Num = 0;
		int sumNum = 0;
		int extraNum = 0;
		
		while(l1 != null || l2 != null) {
			l1Num = l1.val;
			System.out.println(l1Num);
			l1 = l1.next;
			
			l2Num = l2.val;
			System.out.println(l2Num);
			l2 = l2.next;
			
			sumNum = l1Num + l2Num;
			
			if(sumNum > 9) {
				sumNum = sumNum - 10;
				extraNum = 1;
			}
			
			if(extraNum > 0) {
				if(ans == null) {
					ans = new ListNode(sumNum + extraNum);

					System.out.println("test 1 addr : " + ans);
					System.out.println("test 1 val : " + ans.val);
				}else {
					ans = new ListNode(sumNum + extraNum, ans.next);					
					
					System.out.println("test 2 addr : " + ans);
					System.out.println("test 2 val : " + ans.val);
				}
				extraNum = 0;
			}else {
				if(ans == null) {
					ans = new ListNode(sumNum);
					System.out.println("test 3 addr : " + ans);
					System.out.println("test 3 val : " + ans.val);
				}else {
					ans = new ListNode(sumNum, ans.next);
					System.out.println("test 4 addr : " + ans);
					System.out.println("test 4 val : " + ans.val);
				}
			}
		}
        return ans;
    } 
}
