package src;
public class LinkedList<T> implements Iterable<T>{
    protected Node<T> first = null;
    protected Node<T> last = null;



    private boolean isEmpty(){
        return first == null && last == null;
    }

    
    public void insertFirst(T newItem){
        Node<T> newNode = new Node<>(newItem, null);
        if(isEmpty()){
            first = last = newNode;
        }
        else{
            Node<T> oldFirst = first;
            newNode.next = oldFirst;
            first = newNode;
        }

    }

    public void insertLast(T newItem){
        Node<T> newNode = new Node<>(newItem, null);
        if(isEmpty()){
            first = last = newNode;
        }else{
            Node<T> oldLast = last;
            oldLast.next = newNode;
            last = newNode; 
        }
    }



    public void remove(){
        if (first == last) {
            first = last = null;            
        }else{
            Node<T> oldFirst = first;
            first = oldFirst.next;
            oldFirst.next = null;
            oldFirst.value = null;
        }

    }

    @Override
    public LinkedListIterator<T> iterator(){
        return new LinkedListIterator<>(this);

    }


  
    
}

