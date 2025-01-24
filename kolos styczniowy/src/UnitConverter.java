public class UnitConverter implements Converter{

    //nie wiem o co chodzi z "unit" wiec zrobilem cos takiego zeby bylo

    double amount;


    public UnitConverter(double amount){
        this.amount = amount;
    }

    public double convertToEuro(double amount){
        return amount * 4;
    }

    public double convertToUSD(double amount){
        return amount * 4.5;
    }

    public double getConversionRate(String currency){
        if(currency.equals("EUR")){
            return 4.0;
        }
        else if(currency.equals("USD")){
            return 4.5;
        }
        else{
            throw new IllegalArgumentException("Select either EUR or USD.");
        }
    }
}
