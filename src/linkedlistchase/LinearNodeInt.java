package linkedlistchase;
public class LinearNodeInt {
    private int element;
    private LinearNodeInt next;
    
   // CONSTRUCTOR
   public LinearNodeInt(){
       element = 0;
       next = null;
    }
   // when INVOCKED
   public LinearNodeInt(int elem) {
       this.element = elem;
       this.next = null;
    }
   
   // Returns the node that follows this one
   public LinearNodeInt getNext() {
       return next;
    }
    //Sets the node that follows this one
   public void setNext(LinearNodeInt node) {
       next = node;
    }
   // Returns the element stored in this node
   public int getElement(){
       return element;
    }
   // Sets the element stored in this node
   public void setElement(int elem){
       element = elem;
    }
}