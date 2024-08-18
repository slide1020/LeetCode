package Add_Two_Numbers_2;

public class ATN_Solution_day02 {
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
	
	// honestly i'm not understood this sol
	// why rtnAns = ans?
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ans = new ListNode();
		ListNode rtnAns = ans; // <- why..? return ans is wrong, rtnAns is right
		int l1Num = 0;
		int l2Num = 0;
		int sumNum = 0;
		int ansSum = 0;
		int extraNum = 0;
		
		// Loop for l1, l2
		while(l1 != null || l2 != null) {
			
			// sum num initialized
			if(l1 != null && l2 != null) {
				l1Num = l1.val;
				l2Num = l2.val;
				sumNum = l1Num + l2Num + extraNum;
				ansSum = sumNum;
				
				// if sumnum digit is 2, separated
				// and next step add 1
				if(sumNum > 9) {
					extraNum = 1;
					ansSum = sumNum - 10;
				} else {
					extraNum = 0;
				}
				
				l1 = l1.next;
				l2 = l2.next;
				
				ans.val = ansSum;
			} else {
				if(l1 != null) {
					l1Num = l1.val;
					sumNum = l1Num + extraNum;
					l1 = l1.next;
					ansSum = sumNum;
				}
				
				if(l2 != null) {
					l2Num = l2.val;
					sumNum = l2Num + extraNum;
					l2 = l2.next;
					ansSum = sumNum;
				}
				
				if(sumNum > 9) {
					extraNum = 1;
					ansSum = sumNum - 10;
				} else {
					extraNum = 0;
				}
				
				ans.val = ansSum;
			}
			
			// initailized next Node
			// why2.. if "if" sentence dont write,
			// 7080 is return.
			if(l1 != null || l2 != null) {
				ans.next = new ListNode();
				ans = ans.next;
			}
		}
		
		if(extraNum == 1) {
			ans.next = new ListNode();
			ans.next.val = extraNum;
		}

        return rtnAns;
    } 
}
