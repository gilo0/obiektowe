public class Main {

    public static <T> void swap(T[] array, int a, int b){
        if(a > array.length || b > array.length){
        }
        else{
            T temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }

    public static <T extends Animal> T findMax(T element1, T element2){
        if(element1.ilosc > element2.ilosc){
            return element1;
        }
        else{
            return element2;
        }
    }

    public static <T extends Pair<? extends Animal>> Animal findMax(T Pair){
        Animal pierwsze = Pair.first;
        Animal drugie = Pair.second;
        if(pierwsze.ilosc > drugie.ilosc){
            return pierwsze;
        }
        else{
            return drugie;
        }
    }

    public static <T> void FindMinMaxAge(Dog[] dog, Pair<?super Dog> result){
        for
    }

    public static void main(String[] args) {

        Dog doge = new Dog(5, 1, "dog", "pies");
        Dog cheese = new Dog (7, 1, "ser", "pies");
        System.out.println(findMax(doge, cheese).nazwa);
//        Box<String> box = new Box<String>();
//        box.setObiekt("p");
//        Box<String> box2 = new Box<String>();
//        box2.setObiekt("p");
//        System.out.println(box.isEqual(box.getObiekt(), box2.getObiekt()));
//
//        Counter<Integer> counter = new Counter<>();
//        counter.add(5);
//        counter.add(10);
//        System.out.println(counter.getCount());
//
//        Integer[] array = {1,2,3,4};
//        swap(array, 0, 3);
//        System.out.println(array[0]);
//        System.out.println(array[3]);
    }
}