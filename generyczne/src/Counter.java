import java.util.ArrayList;

public class Counter<T>{
    int counter;
    ArrayList<T> lista = new ArrayList<>();

    public void add(T element){
        lista.add(element);
        counter++;
    }

    public int getCount(){
        return counter;
    }
}
