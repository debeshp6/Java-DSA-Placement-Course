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
   
   { conditions:  
     rear = (rear + 1) % size
     rear + 1 = front    >>>>>>>    if this condition satisfies means queue is full }
   
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





