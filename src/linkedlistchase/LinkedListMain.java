package linkedlistchase;
//import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

class LinkedListMain {

    public static void main (String [] args) {
        
        // 1 Build a linked list shown below
        LinkedList list = new LinkedList(); // Creates an object
         
        list.addToFirst(14);
        list.addToFirst(97);
        list.addToFirst(86);
        list.addToFirst(23);
        list.addToFirst(56);
        
        list.printList();
        
        // 3 Input element to search for
        System.out.print("Search for: ");
        Scanner scanner = new Scanner(System.in);
        int itemSearch = scanner.nextInt();
        // 4 Search the list
        if(list.contains(itemSearch) == true)
            System.out.println(itemSearch + " found");
        // 5 output the result of the search
        else
            System.out.println(itemSearch + " not found");
        System.out.println();
        // Call removeFirst method
        list.removeFirst();
        // Prints Contents # 2 Update?
        list.printList();
        
        // Prints updated size of list
        System.out.println(list.size());
        
        // Is the list empty or not?
        System.out.println("Is the linked list empty? " + list.isEmpty());
        
        // Call addToRear Method 
        list.addToRear();
        // Prints Contents # 3 Update?
        list.printList();
        
        // Call RemoveLast method
        list.removeLast();
        
        // Prints Contents # 4 Update?
        list.printList();
        
        
        
    }
}