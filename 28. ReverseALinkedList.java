public class LL {

	Node head;
	private int size;
	
	LL() {
	    this.size = 0;
	}

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	//add first
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	//add last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	  //iterative method
    //time complexity -> O(n)
    //space complexity -> O(1)
    public void reverseList() {
       if(head == null || head.next == null) {
           return;
       }
       Node prevNode = head;
       Node currNode = head.next;
       while(currNode != null) {
           Node nextNode = currNode.next;
           currNode.next = prevNode;
           prevNode = currNode;
           currNode = nextNode;
       }
       head.next = null;
       head = prevNode;
   }

	//print
	public void printList() {
		if(head == null) {
			System.out.println("list is empty.");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("NULL");
	}
	
	//main function
	public static void main(String[] args) {
		LL list = new LL();
		list.addLast("1");
		list.addLast("2");
		list.addLast("3");
		list.addLast("4");
		list.printList();
		
		list.reverseList();
		list.printList();
	}
}


/* you can check out the recursive method on google. let's suppose it is you home task ;) */



//collection method 
//time complexity -> O(n)
//space complexity -> O(1)
import java.util.*;
public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}


/* BYE BYEEEEEEEE! ^_^ */
