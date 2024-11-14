/*

-> the LinkedList class is almost identical to the ArrayList.

-> the LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

-> the LinkedList class has all of the same methods as the ArrayList class because they both implement the list interface.
this means that you can add items, change items, remove items and clear the list in the same way.

-> however, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.

the LinkedList stores its items in "containers." the list has a link to the first container and each container has a link
to the next container in the list. To add an element to the list, the element is placed into a new container and
that container is linked to one of the other containers in the list.

NOTE: use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

LinkedList: 1) variable size
            2) non-contiguous memory
            3) insert in O(1)
            4) search in O(n)

node: a node is a fundamental component of a linked list data structure. a node represents a single element or “item” in the linked list.

 it contains two primary components:

   1. data: this is the actual value or information stored in the node, which can be of any data type (e.g., integer, string, object).
   2. reference (or pointer): this is a link to the next node in the linked list. it points to the node that comes after the current node in the sequence.

head -> first node
tail -> last node

there are total 3 types of LinkedList:

  1. Singly LinkecList
  2. Doubly LinkedList
  3. Circular LinkedList (no null points)

*/



// ok, enough theory... let's learn it from scratch!
// << specially for the beginnerzzz :) >>

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
	
	//delete first
	public void deleteFirst() {
	    if(head == null) {
	        System.out.println("list is empty.");
	        return;
	    }
	    size--;
	    head = head.next;
	}
	
	//delete last
	public void deleteLast() {
	    if(head == null) {
	        System.out.println("list is empty.");
	        return;
	    }
	    size--;
	    if(head.next == null) {
	        head = null;
	        return;
	    }
	    Node secondLast = head;
	    Node lastNode = head.next;
	    while(lastNode.next != null) {
	        lastNode = lastNode.next;
	        secondLast = secondLast.next;
	    }
	    secondLast.next = null;
	}
	
	//size 
	public int getSize() {
	    return size;
	}
	
	//main function
	public static void main(String[] args) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		
		list.addLast("list");
		list.printList();
		
		list.addFirst("this");
		list.printList();
		
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println("size: " + list.getSize());
		list.addFirst("this");
		System.out.println("size: " + list.getSize());
	}
}


// ok, good job captain! you are not beginner anymore.
// now we will do it using the collection framework.
// easy peasy lemon squeeeeezyyyy B)

import java.util.*;

class LL {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);

		list.addFirst("this");
		list.add("list"); // if we just use 'add' then by default the item will be added in the last of the list. same as 'addLast'
		System.out.println(list);

		System.out.println("size of list = " + list.size());

		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " -> ");
		}
		System.out.println("null");

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);
		
		list.remove(1); // delete using index
		System.out.println(list);
	}
}




// let's solve some basic problems... try to do it by yourself, then see the solution!

/* Qs. Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index. */
import java.util.*;
class LL {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.addAll(Arrays.asList(1,5,7,3,8,2,3));
        System.out.println(list);
        
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) == 7) {
                System.out.println(i);
            }
        }
    }
}


/* Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
Delete all nodes which have values greater than 25. */
import java.util.*;
public class LL {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=1; i<=50; i++) {
			list.add(i);
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) > 25) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
		System.out.println(list.size());
	}
}



// enough for now. but keep practicing :)
// byeeeeeeeeeeeeeeeeeeeeeeeee!!!!!!!!!!
