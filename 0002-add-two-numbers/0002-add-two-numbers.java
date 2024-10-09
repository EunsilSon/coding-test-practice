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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder n1 = new StringBuilder();
        StringBuilder n2 = new StringBuilder();
        
        ListNode node = l1;
        while (node != null) {
            n1.append(node.val);
            node = node.next;
        }
        
        node = l2;
        while (node != null) {
            n2.append(node.val);
            node = node.next;
        }
        
        BigInteger total = new BigInteger(n1.reverse().toString()).add(new BigInteger(n2.reverse().toString()));
        
        ListNode head = new ListNode(total.mod(BigInteger.TEN).intValue());
        ListNode answer = head;
        total = total.divide(BigInteger.TEN);
        
        while (total.compareTo(BigInteger.ZERO) != 0) {
            ListNode current = new ListNode(total.mod(BigInteger.TEN).intValue());
            total = total.divide(BigInteger.TEN);
            head.next = current;
            head = current;
        }
        
        return answer;
    }
}