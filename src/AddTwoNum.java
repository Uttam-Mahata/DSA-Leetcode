/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNum {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode result = new ListNode(0);
  ListNode current = result;
  int carry = 0;
  while (l1 != null || l2 != null) {
    int sum = carry;
    if (l1 != null) {
      sum += l1.val;
      l1 = l1.next;
      
    }
    if (l2 != null) {
      sum += l2.val;
      l2 = l2.next;
      
    }
    carry = sum/10;
    current.next = new ListNode(sum%10);
    current = current.next;
    
  
      
  }
      if (carry > 0) {
    current.next = new ListNode(carry);
    
  }
  return result.next;
  
      
}

public static void main(String[] args) {
  ListNode l1 = new ListNode(2);
  l1.next = new ListNode(4);
  l1.next.next = new ListNode(3);
  ListNode l2 = new ListNode(5);
  l2.next = new ListNode(6);
  l2.next.next = new ListNode(4);
  AddTwoNum addTwoNum = new AddTwoNum();
  ListNode result = addTwoNum.addTwoNumbers(l1, l2);
  while (result != null) {
    System.out.print(result.val + " ");
    result = result.next;
    
  }
}
}