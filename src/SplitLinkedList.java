public class SplitLinkedList {

    public static ListNode[] splitListToParts(ListNode head, int k) {
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        cur = head;
        ListNode[] res = new ListNode[k];
        if (len <= k) {
            int i = 0;
            while (cur != null) {
                ListNode temp = cur.next;
                res[i] = cur;
                cur.next = null;
                cur = temp;
                i++;
            }
        } else {
            int extra = len % k;
            int iter = len / k;
            for (int i = 0; i < k; i++) {
                int size = (extra-- > 0) ? iter : iter-1;
                res[i] = cur;
                while (size > 0) {
                    cur = cur.next;
                    size--;
                }
                ListNode temp = cur.next;
                cur.next = null;
                cur = temp;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next.next = new ListNode(7);
        listNode.next.next.next.next.next.next.next = new ListNode(7);
        listNode.next.next.next.next.next.next.next.next = new ListNode(8);
        listNode.next.next.next.next.next.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next.next.next.next.next.next = new ListNode(10);

        ListNode[] res =  splitListToParts(listNode,5);

        for(int i=0;i<res.length;i++){
            res[i].print(i+"th part");
        }
    }
}
