package src;


public class Node<T> {
    protected T value;
    protected Node<T> next;
    protected Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }       

    protected Node(){
        this(null, null);
    }
}


