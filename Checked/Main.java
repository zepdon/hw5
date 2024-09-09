package hw5;

public class Main {
    
    public static Node constructTree1() {
        Node root = new Node(3);  // Root node with value 3
        
        root.left = new Node(7);  // Left child of root
        root.right = new Node(5); // Right child of root
        
        root.left.left = new Node(2);  // Left child of node 7
        root.left.right = new Node(6); // Right child of node 7
        
        root.left.right.left = new Node(1);  // Left child of node 6
        root.left.right.right = new Node(8); // Right child of node 6
        
        root.right.right = new Node(9);      // Right child of node 5
        root.right.right.left = new Node(4); // Left child of node 9
        return root;
    } 

    public static Node constructTree2() {
        Node root = new Node(1);  // Root node with value 1

        root.left = new Node(2);  // Left child of root
        root.right = new Node(3); // Right child of root

        root.left.left = new Node(4);  // Left child of node 2
        root.left.right = new Node(5); // Right child of node 2

        root.left.right.left = new Node(7);  // Left child of node 5
        root.left.right.right = new Node(8); // Right child of node 5

        root.left.right.right.right = new Node(10); // Right child of node 8

        root.right.right = new Node(6);      // Right child of node 3
        root.right.right.left = new Node(9); // Left child of node 6
        return root;
    }

    public static void main(String[] args) {

        Node tree = constructTree1();
        tree.printTree();
    }
}
