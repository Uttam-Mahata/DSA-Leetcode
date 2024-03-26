public class MergeInBetweenLinkedList {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode start = list1;
        ListNode end = list1;
        for (int i = 0; i < a - 1; i++) {
            start = start.next;
        }
        for (int i = 0; i < b; i++) {
            end = end.next;
        }
        start.next = list2;
        ListNode temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = end.next;
        return list1;
    }
    
}
