public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
        return true;
        }
    
        ListNode slow = head;
        ListNode fast = head;
    
        while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        }
    
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;
    
        while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }
    
        ListNode left = head;
        ListNode right = prev;
    
        while (right != null) {
        if (left.val != right.val) {
            return false;
        }
    
        left = left.next;
        right = right.next;
        }
    
        return true;
    }
    
}
