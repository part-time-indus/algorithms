package src;
public class LinkedList<T> implements Iterable<T>{
    protected Node<T> first = null;
    protected Node<T> last = null;
    protected int n = 0;



    private boolean isEmpty(){
        return n == 0;
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
        n++;

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
        n++;
    }



    public void remove(){
        if(n <= 0) return;
        if (first == last) {
            first = last = null;            
        }else{
            Node<T> oldFirst = first;
            first = oldFirst.next;
            oldFirst.next = null;
            oldFirst.value = null;
        }
        n--;

    }


    public int size(){
        return n;
    }

    @Override
    public LinkedListIterator<T> iterator(){
        return new LinkedListIterator<>(this);

    }


  
    
}

