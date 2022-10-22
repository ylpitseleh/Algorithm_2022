package leetcode.easy;

public class _83_RemoveDuplicatesFromSortedList_AGAIN {
    public static void main(String[] args) {
//        ListNode a = new ListNode(1, new ListNode(1, new ListNode(2)));
//        while (a != null) {
//            System.out.println(a.val+" "+a.next+ a.next.next);
//            a = a.next;
//        }
        ListNode a = deleteDuplicates();
        System.out.println(" ANSWER ");
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }

    private static ListNode deleteDuplicates() {
//        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));

        ListNode headNode = head;
        while(headNode != null && headNode.next != null) {
            if (headNode.val == headNode.next.val) {
                headNode.next = headNode.next.next;
            }
            else {
                headNode = headNode.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
