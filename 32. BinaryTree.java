/*

binary tree is a hierarchical data structure.

now let's understand it in simpler language!

if we look at a tree, it has 3 parts - root, branch and leaf. in case of code the tree structure is same as a real tree,
it has root, branch & leaf. but the difference is that in code the root stays in the top and leaf at the bottom of tree.
in simpler words we can say that, tree structure is a reverse of a real tree. cool right...? B)

TREE STRUCTURE:


            +---------------+
            |   Root Node   |
            +---------------+
                    |
                    |
                    v
+---------------+       +---------------+
|  Left Child   |       |  Right Child  |
+---------------+       +---------------+
        |                         |
        |                         |
        v                         v
+---------------+       +---------------+
|  Leaf Node 1  |       |  Leaf Node 2  |
+---------------+       +---------------+


when we talk about binary tree:

  - it is a special type of tree.
  - it can have 2 children at max.
  - in tree a node can have multiple branches. but in a binary tree, there should be only two branches from a node.
  - this is why it's called Binary Tree. [binary means two]
  - the top node is called parent node.
  - sibling nodes, child nodes, ancestors.
  - level, subtree [right & left st], depth.
  
*/



/* Build Tree Preorder.

1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 */

public class BT {
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }
    public static void main (String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}





/* Preorder Traversal:

  1. Root
  2. Left Subtree
  3. Right Subtree 
  
  [1 2 4 5 3 6] --> Preorder Traversal
  you can add -1 as null, or you can keep it blank too.
  i just want to say that, -1 means null. */

/* Build Tree Preorder.

1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 */

public class BT {
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }
    
    //preorder traversal
    //time complexity -> O(n)
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void main (String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        preorder(root);
    }
}




/* Inorder Traversal:

  1. Left Subtree
  2. Root 
  3. Right Subtree 
  
  [4 2 5 1 3 6] */

public class BT {
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }
    
    //inorder traversal
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    public static void main (String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        inorder(root);
    }
}




/* Postorder Traversal:

  1. Left Subtree
  2. Right Subtree
  3. Root
  
  [4 5 2 6 3 1]*/ 

public class BT {
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }
    
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }
    
    //postorder traversal
    //time complexity -> O(n)
    public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    
    public static void main (String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        postorder(root);
    }
}




/* Level Order Traversal:

  1
  2 3
  4 5 6
  
(btw, this question was asked in microsoft, facebook and adobe interiews. so, VVVVVVVI) 

NOTE: we will be using iteration and queue (FIFO) data structure, BFS concept to solve this prolem. */

import java.util.*;

public class BT {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	static class BinaryTree {
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx] == -1) {
				return null;
			}

			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
	}

	//level order traversal
	//time complexity -> O(n)
	public static void levelOrder(Node root) {
		if(root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr = q.remove();
			if(curr == null) {
				System.out.println();
				//queue empty
				if(q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.print(curr.data+" ");
				if(curr.left != null) {
					q.add(curr.left);
				}
				if(curr.right != null) {
					q.add(curr.right);
				}
			}
		}
	}


	public static void main (String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		levelOrder(root);
	}
}





/* Count of Nodes */
import java.util.*;
public class BT {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	static class BinaryTree {
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx] == -1) {
				return null;
			}

			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
	}

    //count of nodes
    public static int countOfNodes(Node root) {
        //time complexity -> O(n)
        if(root == null) return 0;
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        
        return leftNodes + rightNodes + 1;
    }
    
	public static void main (String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.print(countOfNodes(root));
	}
}




/* Sum of Nodes. */
import java.util.*;

public class BT {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	static class BinaryTree {
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx] == -1) {
				return null;
			}

			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
	}

    //sum of nodes
    //time complexity -> O(n)
    public static int sumOfNodes(Node root) {
        
        if(root == null) return 0;
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        
        return leftSum + rightSum + root.data;
    }
    
	public static void main (String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.print(sumOfNodes(root));
	}
}




/* Height of a Tree. */
import java.util.*;

public class BT {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	static class BinaryTree {
		static int idx = -1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx] == -1) {
				return null;
			}

			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
	}

    //height of nodes
    //time complexity -> O(n)
    public static int height(Node root) {
        
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        
        return myHeight;
    }
    
	public static void main (String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		System.out.print(height(root));
	}
}




/* Diameter of a Tree. 
it is also defined as: "Number of Nodes in the Longest path between any 2 nodes".
fyi, this question has been already asked by snapdeal & adobe. so, VVVVVVVI */
