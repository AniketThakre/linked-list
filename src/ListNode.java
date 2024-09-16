import java.util.Iterator;

public class ListNode{
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }



    public void print(String msg){
        ListNode list = this;
        System.out.println("\n" + msg);
        while(list!=null){
            System.out.print(list.val + " --> ");
            list=list.next;
        }
        System.out.print("Null");
    }

}
