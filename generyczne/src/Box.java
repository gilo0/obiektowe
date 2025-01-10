public class Box<T> {
    T obiekt;

    public Box() {
        obiekt = null;
    }

    public Box(T thing){
        this.obiekt = thing;
    }

    public T getObiekt() {
        return obiekt;
    }

    public void setObiekt(T thing) {
        this.obiekt = thing;
    }

    public boolean isEqual(T a, T b){
        return a.equals(b);
    }
}
