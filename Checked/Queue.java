public class Queue {
    Node[] arr; // circular array to store queue elements
    int capacity; // maximum capacity of the queue
    int front; // index of the front element
    int back; // index of the back element (next insertion point)
    int size; // current size of the queue
    
    public Queue(int cap){
        this.arr = new Node[cap];   // Create an array of size 'cap'
        this.capacity = cap;        // Set the queue capacity
        this.front = 0;             // Front starts at index 0
        this.back = 0;              // Back starts at index 0
        this.size = 0;              // Initially, the queue is empty
    }
    public void enqueue(Node node){ //Add an element to the back of the queue
        if (!isFull()){
            // do something
            arr[back++] = node;//add new node at the back then increment back index
            if (back == capacity) {// If back reaches the end of the array, wrap around to the start
                back = 0;
            }
            size++;
            
        }else{
            System.out.println("Queue Overflow!!!");
        }
    }
    
    public Node dequeue(){//Remove an element from the front of the queue
        
        if (!isEmpty()){
            // do something
            Node tmp = arr[front++];// Store the front element and increment the front index
            if (front == capacity) {// If front reaches the end of the array, wrap around to the start
                front = 0;
            }
            size--;
            return tmp;// Return the dequeued node
            
        }else{
            System.out.println("Queue Underflow!!!");
        }
        return null; // Return null if no element can be dequeued (queue was empty)
    }
    
    public boolean isEmpty(){
        return size == 0; // Queue is empty when the size is 0
    }
    
    public boolean isFull(){
        return size == capacity; // Queue is full when the size reaches the capacity
    }
    
    public void printCircularIndices(){
        System.out.println("Front index = " + front + " Back index = " + back);
    }
    
    public void printQueue(){
        if (!isEmpty()){
            System.out.print("[Front] ");
            int curr = front; // Start from the front of the queue
            for (int i = 0; i < size; i++) { // Loop through all the elements in the queue
                System.out.print(arr[curr++].data + " ");// Print the data at the current position
                if (curr == capacity) {
                    curr = 0;
                }
            }
            System.out.println("[Back]");
        }else{
            System.out.println("Empty Queue!!!");
        }
    }
}