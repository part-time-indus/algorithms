import src.ResizingArrayStack;

public class Entry {
    public static void main(String[] args){
        ResizingArrayStack<Integer> r = new ResizingArrayStack<>();
        r.push(1);
        r.push(2);
        for(Object i: r){
            System.out.println((Integer)i);
        }
    }
}
