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
    //time complexity -> O(n)
    //space complexity -> O(1)
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
        
        if(n == size) {
            return head.next;
        }
        
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while(i < indexToSearch) {
            prev = prev.next;
            i++
        }
        
        prev.next = prev.next.next;
        return head;
    }
}






/* Q2. Check if a Linked List is a palindrome. */

/*

STRATEGY =>

    1. middle of LL
    2. 2nd half reverse
    3. check 1st half & 2nd half
    
*/

class Solution {
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    public ListNode findMiddle(ListNode head) {
        //using hare turtle concept here.
        //i want you to do a little research on it.
        ListNode hare = head;
        ListNode turt = head;
        
        while(hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turt = turt.next;
        }
        
        return turt;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) { //head.next means single node
            return true;
        }
        
        ListNode middle = findMiddle(head); //end of 1st half
        ListNode secondHalfStart = reverse(middle.next);
        ListNode firstHalfStart = head;
        
        while(secondHalfStart != null) {
            if(firstHalfStart.val != secondHalfStart) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
}







/* Q3. Detecting Loop in a Linked List. */

/* we will be using the hare-turtule concept again in this problem. (watch a video tutorial in youtube,
if you are doing it for the first time) */

public class Solution {
    //time complexity -> O(n)
    //space complexity -> O(1)
    public boolean hasCycle(ListNode head) {
        
        if(head == null) return false;
        
        ListNode hare = head; //fast
        ListNode turtule = head; //StackOverflowError
        
        while(hare != null && hare.next != null) {
            hare = hare.next.next; //iincreasing by 2, because hare takes 2 steps
            turtule = turtule.next; //increasing by 1, because turtule takes 1 step
            
            if(hare == turtule) {
                return true;
            }
        }
        return false;
    }
} 



// GOOD GOIN, ALL THE BEST! 😃
