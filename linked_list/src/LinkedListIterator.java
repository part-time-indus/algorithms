package src;

import java.util.Iterator;


public class LinkedListIterator<T> implements Iterator<T>{
    protected LinkedList<T> list = null;
    protected Node<T> nextNode = null; 

    protected LinkedListIterator(LinkedList<T> list){
        this.list = list;
        this.nextNode = list.first;
    }


    @Override
    public boolean hasNext(){
        if(list == null){
            return false;
        }
        if(nextNode == null){
            return false;
        }
        return true;
        
    }

    @Override
    public T next(){
        Node<T> currNode = nextNode;
        nextNode = currNode.next;
        return currNode.value;
    }

    @Override
    public void remove(){}


    
}
