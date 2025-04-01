package LinkiedList;

public class LinkiedList {
    private Node head ;
    private Node tail ;
    private int length ;

    class Node {
        int value; // value of linkied list
        Node next;//pointer to a node 
        
        Node(int value){
            this.value = value;
        }
    }
    public LinkiedList(int value){
        Node newNode = new Node(value);
        head = newNode ;
        tail = newNode ;
        length = 1;
    }
    
    
}
