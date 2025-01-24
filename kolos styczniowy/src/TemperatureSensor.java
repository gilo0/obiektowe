public class TemperatureSensor implements Sensor{

    double temperature = 0;

    String status;

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
        status = "Sensor active";
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        status = "Sensor active";
    }

    public double readValue(){
        return temperature;
    }

    public String getStatus(){
        return status;
    }

    public void reset(){
        temperature = 0;
        status = "Sensor inactive - must set the temperature";
    }

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor(10);
        System.out.println(sensor.readValue());
        System.out.println(sensor.getStatus());
        sensor.reset();
        System.out.println(sensor.readValue());

    }
}
