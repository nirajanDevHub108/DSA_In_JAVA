package LinkiedList;

public class LinkiedList {
    private Node head ;
    private Node tail ;
    private int length ;

    public LinkiedList(int value){
        Node newNode = new Node(value);
        head = newNode ;
        tail = newNode ;
        length = 1;
    }


    
}
