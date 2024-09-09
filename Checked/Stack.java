public class Stack {
    Node[] arr; // regular array
    int capacity;// maximum capacity of the stack
    int size;// current size of the stack

    public Stack(int cap){
        this.arr = new Node[cap];// initialize the array with the given capacity
        this.capacity = cap;// Set the stack capacity
        this.size = 0;// initially, the stack is empty
    }
    
    public void push(Node node){//Push a Node onto the stack
        if (!isFull()){
            // do something
            arr[size++] = node;// add the node to the top of the stack then increment the size
        }else{
            System.out.println("Stack Overflow!!!");
        }
    }
    public Node pop(){//Pop the top Node from the stack
        if (!isEmpty()){
            // do something
            Node tmp = arr[--size];// Decrement the size and return the top node
            return tmp;// return the popped node
        }else{
            System.out.println("Stack Underflow!!!");
        }
        return null; // fix this (out of place)
    }
    public boolean isFull(){
        return size == capacity; // Stack is full when the current size equals the capacity
    }
    public boolean isEmpty(){
        return size == 0; // Stack is empty when the size is 0
    }
    
    public void printStack(){
        if (!isEmpty()) {
            System.out.print("[Bottom] ");
            // do something here
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i].data + " "); // Print all data from bottom to top
            }
            System.out.println("[Top]");
        } else {
            System.out.println("Empty Stack!!!");
        }
    }
}