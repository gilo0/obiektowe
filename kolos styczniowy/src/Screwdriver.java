public class Screwdriver extends WorkTool{

    public Screwdriver(String name, int productionYear){
        this.name = name;
        this.productionYear = productionYear;
    }
    public void use() {
        System.out.println("(screwdriver noises)");
    }
}
