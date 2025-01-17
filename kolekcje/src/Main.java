import java.util.*;

public class Main {

    public static <T> void printUnique(Collection<T> items){
        Set<T> uniqueElements = new HashSet<>(items);
        for(T item : uniqueElements){
            System.out.println(item);
        }
    }

    public static <T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2){
        ArrayList<T> result = new ArrayList<>();
        for(T item : list1){
            result.add(item);
        }
        for(T item : list2){
            result.add(item);
        }
        return result;
    }

    public static <T> HashSet<T> findUniqueElements(List<T> list){
        HashSet<T> uniqueElements = new HashSet<>(list);
        return uniqueElements;
    }

    public static <T> TreeSet<T> findElementsInRange(TreeSet<T> treeset, T lowerbound, T upperbound){
        TreeSet<T> result = new TreeSet<>();
        for(T item : treeset){
            if(item.hashCode() >= lowerbound.hashCode() && item.hashCode() <= upperbound.hashCode()){
                result.add(item);
            }
        }
        return result;
    }

    public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey){
        TreeMap<K, V> result = new TreeMap<>();
        for(Map.Entry<K, V> entry : map.entrySet()){
            if(entry.getKey().hashCode()>=(startKey).hashCode() && entry.getKey().hashCode()<=(endKey).hashCode()){
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }
    public static void main(String[] args) {

//        List<Integer> lista = new ArrayList<>();
//        lista.add(1);
//        lista.add(2);
//        lista.add(1);
//        lista.add(2);
//        HashSet<Integer> hashset = findUniqueElements(lista);
//        for(Integer item : hashset){
//            System.out.println(item);
//        }

        TreeSet<Integer> treeset1 = new TreeSet<>();
        treeset1.add(1);
        treeset1.add(2);
        treeset1.add(3);
        treeset1.add(4);
        treeset1.add(5);
        treeset1.add(6);
        TreeSet<Integer> treeset2 = findElementsInRange(treeset1, 2, 5);
        System.out.println("treeset");
        for(Integer item : treeset2){
            System.out.println(item);
        }
//        Collection<Integer> kolekcja = new ArrayList<>();
//        kolekcja.add(1);
//        kolekcja.add(2);
//        kolekcja.add(3);
//        kolekcja.add(4);
//        kolekcja.add(3);
//        kolekcja.add(2);
//        printUnique(kolekcja);
//        ArrayList<Integer> lista1 = new ArrayList<>();
//        ArrayList<Integer> lista2 = new ArrayList<>();
//        lista1.add(10);
//        lista2.add(20);
//        lista1.add(30);
//        lista2.add(40);
//        ArrayList<Integer> lista3 = merge(lista1, lista2);
//        for(Integer item : lista3){
//            System.out.println(item);
//        }
    }
}