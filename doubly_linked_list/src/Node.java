package doubly_linked_list.src;

class Node<T>{
    T value = null;
    Node<T> next = null;
    Node<T> prev = null;

    protected Node(T value, Node<T> next, Node<T> prev){
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    protected Node(T value){
        this(value, null, null);
    }
}