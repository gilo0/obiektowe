public class Triple <A, B, C>{
    A first;
    B second;
    C third;

    public Triple(A first, B second, C third){
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst(){
        return first;
    }

    public B getSecond(){
        return second;
    }

    public C getThird(){
        return third;
    }

    public static void main(String[] args) {
        int first = 5;
        String second = "Zug zug";
        double third = 4.20;
        Triple triple = new Triple(first, second, third);
        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());

    }
}
