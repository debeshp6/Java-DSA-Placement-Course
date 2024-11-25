/*

a Queue data structure is a fundamental concept in computer science used for storing and managing data in a specific order.
it follows the principle of "First In First Out" (FIFO), where the first element added to the queue is the first one to be removed.
queues are commonly used in various algorithms and applications for their simplicity and efficiency in managing data flow.

- queue data structure is a linear data structure that is open at both ends and the operations are performed in First In First Out (FIFO) order.
- a queue is like a line waiting to purchase tickets, where the first person in line is the first person served. (i.e. first come first serve).
- position of the entry in a queue ready to be served, that is, the first entry that will be removed from the queue, is called the front of the queue (sometimes, head of the queue).
similarly, the position of the last entry in the queue, that is, the one most recently added, is called the rear (or the tail) of the queue. [in simple words we can sayy that,
we add data from rear/backside and remove data from front]

Operations:

  1. add [enque]
  2. remove [dequeue]
  3. peek [front]


=> Implementation 1: queue using array. [fixed size]
=> Implementation 2: circular queue using array. [all case TL -> O(1)]
   
   if you don't know what's circular queue, better if u watch a video on YT :D

   a circular queue is an extended version of a normal queue where the last element of the queue is connected to the first element of the queue forming a circle.
  
   { conditions:  
     rear = (rear + 1) % size    >>>>>>>    if this condition satisfies means queue is full
     rear + 1 = front }

=> Implementation 3: queue using linked list.
*/



//queue: array implementation
public class QueueArray {

	static class Queue {
		static int arr[];
		static int size;
		static int rear;

		Queue(int size) {
			this.size = size;
			arr = new int[size];
			rear = -1;
		}
	}

	public static boolean isEmpty() {
		return rear == -1;
	}

	//add function [enque] - O(1)
	public static void add(int data) {
		if(rear == size-1) {
			System.out.println("queue full");
			return;
		}
		rear++;
		arr[rear] = data;
	}

	//remove function [dequeue] - O(n)
	public static int remove() {
		if(isEmpty()) {
			System.out.println("queue empty");
			return -1;
		}

		int front = arr[0];
		for(int i=0; i<rear; i++) {
			arr[i] = arr[i+1];
		}

		rear--;
		return front;
	}

	//peek function - O(n)
	public static int peek() {
		if(isEmpty()) {
			System.out.println("queue empty");
			return -1;
		}

		int front = arr[0];
		return front;
	}

	//main function
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);

		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}






//circular queue: array implementation
public class QueueArray {

	static class Queue {
		static int arr[];
		static int size;
		static int rear = -1;
		static int front = -1;
		

		Queue(int n) {
			arr = new int[n];
			this.size = n;
		}
	}

    //empty conditon
	public static boolean isEmpty() {
		return rear == -1 && front == -1;
	}
	
	//full conditon
	public static boolean isFull() {
	    return (real+1) % size == front;
	}

	//add function [enque] - O(1)
	public static void add(int data) {
		if(isFull()) {
			System.out.println("queue full");
			return;
		}
		//1st element add
		if(front == -1) {
		    front = 0;
		}
		rear = (rear+1) % size;
		arr[rear] = data;
	}

	//remove function [dequeue] - O(1)
	public static int remove() {
		if(isEmpty()) {
			System.out.println("queue empty");
			return -1;
		}

		int result = arr[front];
		//single element conditon
		if(rear == front) {
		    rear = front = -1;
		} else {
		    front = (front+1) % size;
		}
		return result;
	}

	//peek function - O(n)
	public static int peek() {
		if(isEmpty()) {
			System.out.println("queue empty");
			return -1;
		} 
		return arr[front];
	}

	//try to make the main function by yourself, hehe :)


	





//queue: linked list implementation
public class QueueLL {

	static class Node {
		int data;
		Node next;
		Node (int data) {
			this.data = data;
			next = null;
		}
	}

	static class Queue {
		static Node head = null;
		static Node tail = null;
	}

	//empty condition
	public static boolean isEmpty() {
		return head == null & tail == null;
	}

	//add
	public static void add(int data) {
		Node newNode = new Node(data);
		if(tail == null) {
			tail = head = newNode;
			return;
		}

		tail.next = newNode;
		tail = newNode;
	}

	//remove
	public static int remove() {
		if(isEmpty()) {
			System.out.println("queue is empty.");
			return -1;
		}

		int front = head.data;
		if(head == tail) {
			tail = null;
		}

		head = head.next;
		return front;
	}

	//peek
	public static int peek() {
		if(isEmpty()) {
			System.out.println("queue is empty.");
			return -1;
		}

		return head.data;
	}

    	//main function
	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}






//queue: collection framework [using linked list]
import java.util.*;
public class QueueCF {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}





//queue: collection framework [using array]
import java.util.*;
public class QueueCF {
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}






// let's solve one problem for better understanding :D

/* Qs. Queue using 2 Stacks.

	push [O(n)]
 	pop [O(n)] */

import java.util.*;

public class QueueCF {
    
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        //empty condition 
        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        
        //add 
        public static void add(int data) {
            
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            
            s1.push(data);
            
            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        
        //remove 
        public static int remove() {
            if(isEmpty()) {
                System.out.println("queue is empty.");
                return -1;
            }
            return s1.pop();
        }
        
        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("queue is empty.");
                return -1;
            }
            return s1.peek();
        }
    }
    
    //main
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}




// best of luck, BYEEEEEEEEEEE!! 😃
