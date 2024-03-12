import java.util.HashMap;
import java.util.Map;

public class RemoveZeroSumConsecutive {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer, ListNode> map = new HashMap<>();
        int sum = 0;
        for (ListNode i = dummy; i != null; i = i.next) {
            sum += i.val;
            map.put(sum, i);
        }
        sum = 0;
        for (ListNode i = dummy; i != null; i = i.next) {
            sum += i.val;
            i.next = map.get(sum).next;
        }
        return dummy.next;
    }
    
}
