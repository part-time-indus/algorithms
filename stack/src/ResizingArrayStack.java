package src;
import java.util.*;



public class ResizingArrayStack<T> implements Iterable{

    private T[] elements = (T[]) new Object[1];

    private int index = 0;

    public boolean isEmpty()
    {
        return index == 0;

    }

    public int size() 
    {
        return index;
    }

    private void resize(int newSize)
    {
        T[] temp = (T[]) new Object[newSize];
        for(int i = 0; i < elements.length; i++){
            temp[i] = elements[i];
        }
        elements = temp;
    }

    public void push(T element)
    {
        if(index == elements.length){
            resize(2*elements.length);
        }
        elements[index++] = element;

    }

    public T pop()
    {
        T item = elements[--index];
        elements[index] = null;
        if(index == elements.length/4){
            resize(elements.length/2);
        }
        return item;
    }
    
    @Override
    public Iterator<T> iterator(){
        return new ReverseArrayIterator<>();
    }

    private class ReverseArrayIterator<T> implements Iterator<T>{
        private int i = index;
        
        @Override
        public boolean hasNext(){
            return i > 0;
        }

        @Override
        public T next(){
            return (T)elements[--i];
        }

        @Override
        public void remove(){
            
        }
    }


}