/* <----------------- PLEASE DON'T SKIP THESE 3 QUESTIONS -----------------> */

// // // ****************** VERY VERYY IMPORTANT ****************** \\ \\ \\







/* Q1. Find the nth node from the end & remove it. */

/* 

suppose, 1 -> 2 -> 3 -> 4 -> 5 -> N

n = 2, size = 5

distance from start => size - n + 1 => 5 - 2 + 1 = 4
distance from start (prev node) => size - n => 5 - 2 = 3

*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }
        
        int size = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            size++;
        }
        
        int indexToSearch = size - n;
        
    }
}

UPDATINGGG................
