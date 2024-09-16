import java.util.Arrays;

public class SpiralMetrixIV {

    public static int[][] spiralMetrix(int m, int n, ListNode head){
        int[][] res = new int[m][n];
        Arrays.fill(res,-1);
        while(head!=null){
            int i=0,j=0;
            for(int k=i;k<n-1;k++){
                res[i][j]=head.val;
                head=head.next;
            }
            while(j<m-1){
                res[i][j]=head.val;
                head=head.next;
                j++;
            }
            while(i>0){

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
        listNode.next.next.next.next.next.next.next = new ListNode(8);
        listNode.next.next.next.next.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next.next.next.next.next = new ListNode(10);
        listNode.next.next.next.next.next.next.next.next.next.next = new ListNode(11);

        int[][] res =  spiralMetrix(3, 4, listNode);

        for(int i=0;i<res.length;i++){
            for (int j=0;j<res[0].length;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
