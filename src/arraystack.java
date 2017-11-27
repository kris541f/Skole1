import java.util.ArrayList;

public class arraystack<E> implements Inter<E> {
    ArrayList<E> liste;

    public arraystack(){
        liste = new ArrayList<E>();
    }

    @Override
    public E pop() {
        return liste.remove(liste.size()-1);
    }

    @Override
    public void push(E x) {
        liste.add(x);

    }

    @Override
    public E peek() {
        return liste.get(liste.size() - 1);
    }

    @Override
    public boolean isempty() {
        return liste.isEmpty();
    }
    public static void main(String []args){
        arraystack<String> hej = new arraystack();
        hej.push("frg");
        System.out.println("Should be 5: "+hej.peek());
        System.out.println("Print 5? "+ hej.pop());
        if (hej.isempty()){
            System.out.println("This is empty");
        }

    }
}
