package Linked_List_Cycle_141;

class LLC_141_Day02 {
	public static void main(String args[]) {
		ListNode listNode1 = new ListNode(3);
		listNode1.next = new ListNode(2);
		listNode1.next.next = new ListNode(0);
		listNode1.next.next.next = new ListNode(-4);
		
		ListNode listNode2 = new ListNode(1);
		listNode2.next = new ListNode(2);
		
		ListNode listNode3 = new ListNode(1);
		
		boolean ans1 = hasCycle(listNode1);
		System.out.println(ans1);
//		boolean ans2 = hasCycle(listNode2);
//		System.out.println(ans2);
//		boolean ans3 = hasCycle(listNode3);
//		System.out.println(ans3);
		
		
	}
	
    public static boolean hasCycle(ListNode head) {
    	ListNode fast = null;
    	ListNode slow = null;
    	
    	if(null == head.next || null == head) {
    		System.out.println("next is null occured");
    		return false;
    	}
    	
		fast = head;
		slow = head;
    	
    	try {
    		while(null != fast && null != slow) {
    			fast = fast.next.next;
    			slow = slow.next;
    			System.out.println("fast : " + fast);
    			System.out.println("slow : " + slow);
    			if(fast == slow) {
    				return true;
    			}
    		}
    	}catch(Exception e){
    		System.out.println("exception occured");
    		return false;
    	}
    	
    	return false;
    }
}
