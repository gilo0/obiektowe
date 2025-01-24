public class Hammer extends WorkTool{

    public Hammer(String name, int productionYear){
        this.name = name;
        this.productionYear = productionYear;
    }
    public void use() {
        System.out.println("Bonk");
    }

    public static void main(String[] args) {
        Hammer mlot = new Hammer("mlot", 1000);
        mlot.use();
    }
}
