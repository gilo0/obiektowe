public class PressureSensor implements Sensor{

    double pressure = 0;
    String status;

    public PressureSensor(double pressure){
        this.pressure = pressure;
        status = "Sensor active";
    }

    public void setPressure(double pressure){
        this.pressure = pressure;
        status = "Sensor active";
    }

    public double readValue(){
        return pressure;
    }

    public String getStatus(){
        return status;
    }

    public void reset(){
        pressure = 0;
        status = "Sensor inactive - must set the pressure";
    }



}
