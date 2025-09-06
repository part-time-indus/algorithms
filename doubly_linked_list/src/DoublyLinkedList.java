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

            //*** For list with one element check fails ***//

            if(oldFirst.next != null){
                oldFirst.next = oldFirst.next.next;
            }
            oldFirst.prev = newNode;
            newNode.next = oldFirst;
            first = newNode;
        }
        itemsCount++;

    }

    public void insertAtEnd(T item){
        Node<T> newNode = new Node<T>(item);
        if(isEmpty()){
            first = last = newNode;
        }else{
            Node<T> oldLast = last;
            oldLast.next = newNode;
            newNode.prev = oldLast;
            last = newNode;
        }
        itemsCount++;
    }


    private boolean nodeExists(Node<T> node){
        if(node == null) return false;
        Node<T> currNode = first;
        boolean nodeFound = false;
        while(currNode != null){
            boolean nodesEqual = currNode.value == node.value &&
                                currNode.prev == node.prev &&
                                currNode.next == node.next;
            if(nodesEqual){
                nodeFound = true;
            }
            currNode = currNode.next;
        }
        return nodeFound;
    }

    public void insertAfter(T item, Node<T> node){
        if(node != null && nodeExists(node)) {
            Node<T> newNode = new Node<>(item);

            //**** For another node present after given node ***//

            if(node.next != null){
                newNode.next = node.next.next;
            }
            newNode.prev = node;
            node.next = newNode;
            itemsCount++;
        }
    }

    public void insertBefore(T item, Node<T> node){
        if(node != null && nodeExists(node)){
            Node<T> newNode = new Node<>(item);

            //**** For another node present before given node ***//
            
            if(node.prev != null){
                newNode.prev = newNode.prev.prev; 
            }

            newNode.next = node;
            node.prev = newNode;
            itemsCount++;
        }
    }

    public T removeFromBeginning(){
        if(isEmpty()) return null;
        Node<T> nodeToRemove = first;
        Node<T> newFirstNode = nodeToRemove.next;

        //**** For only one node in the list ***//

        if(newFirstNode == null){
            first = last = null;
        }else{
            newFirstNode.prev = null;
            first = newFirstNode;
        }
        itemsCount--;
        return nodeToRemove.value;
    }

    public T removeFromEnd(){}

    public T deleteNode(Node<T> node){}

    public T deleteValue(T item){}

    public search(T item){}



    
}
