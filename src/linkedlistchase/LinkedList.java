package linkedlistchase;

public class LinkedList {
    // Instance variable, head.
    private LinearNodeInt head; // iNSTANCE NODE NAMED HEAD
    
    // Size var for size method
    int size;
    
    // Constructor: Creates an empty list
    
    public LinkedList(){
        head = null;       
    }
    
    // Prints elements of the list
    public void printList(){
        LinearNodeInt current = head;
        while(current != null) {
            System.out.print(current.getElement() + "   ");
            current = current.getNext();
        }
        System.out.println();
    }
    
    // Returns true if this list contains the specified target element
    public boolean contains(int element) {
        boolean found = false;
        LinearNodeInt current = head;
        
        while (current != null && !found)
            if (element == (current.getElement()))
                found = true;
            else
                current = current.getNext();
            return found;
    }
    
    // Adds the specified eleent to the front of this list
    public void addToFirst(int element) {
        LinearNodeInt temp = head;
        head = new LinearNodeInt(element);
        head.setNext(temp);
    }
    
    // Removes and retruns the fisr element from this list
    public int removeFirst(){
        int elem;
        int item;
        if (head != null)
            item = head.getElement();
        else
            item = 0;
            if(head != null)
                head = head.getNext();
        return item;
    }
    
    // Returns size of elements in list
    public int size(){
       int size = 0;
       LinearNodeInt index = head;
       while(index != null){
           size++;
           index = index.getNext();
        }
       return size;
    }
    
    
    // Returns TRUE if list is empty, FALSE otherwise
    public boolean isEmpty(){
        if (head == null)
            return true;
        else
            return false;
    }
    
    //addToRear Method
    public void addToRear() {
        LinearNodeInt current = head;
        while(current.getNext() != null ){
           current = current.getNext();
        }    
        // Create node
        LinearNodeInt newNode = new LinearNodeInt();
        // Set it to 88
        newNode.setElement(88);
        // Print content to test 
        System.out.println(newNode.getElement());
        // Tail to previous node
        current.setNext(newNode);
    }
   
    
    //removeLast Method
    public void removeLast() {
        LinearNodeInt current = head;
        LinearNodeInt previous = head;
        while(current.getNext() != null){
            previous = current;
            current = current.getNext();
        }    
        // Delete last node
        previous.setNext(null);
    }
    
}