/*

a Stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. it’s a collection of elements, and the order of addition and removal is crucial.
in java, the Stack class is part of the java.util package and extends the Vector class.

NOTE: LIFO process is just like the undo option in word/powerpoint.

Basic Operations:

  1. push: adds an element to the top of the stack. [time complexity -> O(1)]
  2. pop: removes the top element from the stack. [time complexity -> O(1)]
  3. peek: returns the top element without removing it. [time complexity -> O(1)]



Implementation:

  1. Array (fixed size - last element as top)
  2. ArrayList (variable size)
  3. Linked List (variable size)

*/






//stack: linked list implementation
public class StackClass {
    
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    
    static class Stack {
        public static Node head;
        public static boolean isEmpty() {
            return head == null;
        }
        
        //push function
        public static void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        
        //pop function
        public static int pop() { //pop func deletes as well as return the value that's why 'int'
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        
        //peek function
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }
    }
    
    //main function
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}








//stack: arraylist implementation
import java.util.ArrayList;
public class StackClass {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        
        //push function
        public static void push(int data) {
            list.add(data);
        }
        
        //pop function
        public static int pop() {
            if(isEmpty()) {
            return -1;
        }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        
        //peek function
        public static int peek() {
            if(isEmpty()) {
            return -1;
        }
            int top = list.get(list.size() - 1);
            return top;
        }
    }

    
    //main function
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}








//stack: using collection framework
import java.util.*;
public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}




/* Qs. Push at the bottom of Stack */
import java.util.*;
public class StackPrbs {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(4, s);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}





/* Reverse the Stack */
import java.util.*;
public class StackPrbs {
    public static void bottomPush(int data, Stack<Integer> s) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        bottomPush(data, s);
        s.push(top);
    }
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) return;
        int top = s.pop();
        reverse(s);
        bottomPush(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}





// BYEEEEEEEEEEEEEEEEEEEEE :D
