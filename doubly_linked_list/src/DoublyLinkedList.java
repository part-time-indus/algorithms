package doubly_linked_list.src;

public class DoublyLinkedList<T> {
    private Node<T> first = null;
    private Node<T> last = null;
    private int itemsCount = 0;


    private boolean isEmpty(){
        return itemsCount == 0;
    }

    public int size(){
        return itemsCount;
    }


    public void insertAtBeginning(T item){}

    public void insertAtEnd(T item){}

    public void insertAfter(T item, Node<T> node){}

    public void insertBefore(T item, Node<T> node){}

    public T removeFromBeginning(){}

    public T removeFromEnd(){}

    public T deleteNode(Node<T> node){}

    public T deleteValue(T item){}

    public search(T item){}



    
}
