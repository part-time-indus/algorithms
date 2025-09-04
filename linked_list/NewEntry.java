import src.LinkedList;
public class NewEntry {

    public static void main(String[] args) {
     LinkedList<String> l = new LinkedList<>();

     l.insertFirst("Welcome");
     l.insertLast("To");
     l.insertLast("Java Land");
     l.insertFirst("Hello, ");

     l.remove();

        for(String s: l){
            System.out.println(s);
        }
    

    }

}
