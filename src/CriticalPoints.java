import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class CriticalPoints {
    
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        int firstCriticalIndex = -1;
        int lastCriticalIndex = -1;
        int minDistance = Integer.MAX_VALUE;
        int index = 1;
        ListNode prev = head;
        ListNode current = head.next;
        ListNode next = current.next;

        while (next != null) {
            if ((current.val > prev.val && current.val > next.val) || (current.val < prev.val && current.val < next.val)) {
                if (firstCriticalIndex == -1) {
                    firstCriticalIndex = index;
                } else {
                    minDistance = Math.min(minDistance, index - lastCriticalIndex);
                }
                lastCriticalIndex = index;
            }
            prev = current;
            current = next;
            next = next.next;
            index++;
        }

        if (firstCriticalIndex == lastCriticalIndex) {
            return new int[]{-1, -1};
        }

        return new int[]{minDistance, lastCriticalIndex - firstCriticalIndex};
    }

    public static void main(String[] args) {
        CriticalPoints solution = new CriticalPoints();

        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(1);
        System.out.println(Arrays.toString(solution.nodesBetweenCriticalPoints(head1))); // Output: [-1, -1]

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(2);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(1);
        head2.next.next.next.next.next.next = new ListNode(2);
        System.out.println(Arrays.toString(solution.nodesBetweenCriticalPoints(head2))); // Output: [1, 3]

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(3);
        head3.next.next = new ListNode(2);
        head3.next.next.next = new ListNode(2);
        head3.next.next.next.next = new ListNode(3);
        head3.next.next.next.next.next = new ListNode(2);
        head3.next.next.next.next.next.next = new ListNode(2);
        head3.next.next.next.next.next.next.next = new ListNode(2);
        head3.next.next.next.next.next.next.next.next = new ListNode(7);
        System.out.println(Arrays.toString(solution.nodesBetweenCriticalPoints(head3))); // Output: [3, 3]
    }
}
