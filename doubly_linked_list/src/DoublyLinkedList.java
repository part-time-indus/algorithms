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


    public void insertAtBeginning(T item){
        if(item == null) return;
        Node<T> newNode = new Node<>(item);
        if(isEmpty()){
            first = last = newNode;
        }else{
            Node<T> oldFirst = first;

            //*NOTE: For list with one element check fails

            if(oldFirst.next != null){
                oldFirst.next = oldFirst.next.next;
            }
            oldFirst.prev = newNode;
            newNode.next = oldFirst;
            first = newNode;
        }
        itemsCount++;

    }

    public void insertAtEnd(T item){}

    public void insertAfter(T item, Node<T> node){}

    public void insertBefore(T item, Node<T> node){}

    public T removeFromBeginning(){}

    public T removeFromEnd(){}

    public T deleteNode(Node<T> node){}

    public T deleteValue(T item){}

    public search(T item){}



    
}
