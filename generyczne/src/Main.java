import java.util.ArrayList;

public class Main {

    public static <T> void swap(T[] array, int a, int b){
        if(a > array.length || b > array.length){
            return;
        }
        else{
            T temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }

    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.setObiekt("p");
        Box<String> box2 = new Box<String>();
        box2.setObiekt("p");
        System.out.println(box.isEqual(box.getObiekt(), box2.getObiekt()));

        Counter<Integer> counter = new Counter<>();
        counter.add(5);
        counter.add(10);
        System.out.println(counter.getCount());

        Integer[] array = {1,2,3,4};
        swap(array, 0, 3);
        System.out.println(array[0]);
        System.out.println(array[3]);
    }
}