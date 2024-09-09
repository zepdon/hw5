public class Node extends BTreePrinter { // Fix this line

    Node left;// References to left child nodes in the binary tree
    Node right;// References to right child nodes in the binary tree
    int data;// The value stored in this node

    public Node(int data) {// Constructor to initialize a Node
        // Add something
        this.data = data;// Initialize the node's value
        this.left = null;// The left children are initialized to null (no child yet)
        this.right = null;// The right children are initialized to null (no child yet)
    }

    public void printTree() {
        super.printTree(this);
    }

    public void printBFT() {
        Queue q = new Queue(50);// Initialize a Queue
        System.out.print("BFT node sequence [ ");
        // Do something
        q.enqueue(this);// Start the traversal by enqueuing the root node
        while (!q.isEmpty()) {// Traverse the tree while the queue is not empty
            Node curr = q.dequeue();// Dequeue the front node and print it
            System.out.print(curr.data + " ");
            if (curr.left != null) {// If the current node has a left child, enqueue it
                q.enqueue(curr.left);
            }
            if (curr.right != null) {// If the current node has a right child, enqueue it
                q.enqueue(curr.right);
            }
        }
        System.out.println("]");
    }

    public void printDFT() { // PreOrder
        Stack s = new Stack(50);// Initialize a Stack to help
        System.out.print("DFT node sequence [ ");
        // Do something
        s.push(this);// Start the traversal by pushing the root node
        while (!s.isEmpty()) {// Traverse the tree while the stack is not empty
            Node curr = s.pop();// Pop the top node from the stack and print it
            System.out.print(curr.data + " ");
            if (curr.right != null) {// If its has right chile push the right child first so that the left child is processed first
                s.push(curr.right);
            }
            if (curr.left != null) {//If its has left chile push the left child next to maintain pre-order traversal order
                s.push(curr.left);
            }
        }
        System.out.println("]");
    }
}