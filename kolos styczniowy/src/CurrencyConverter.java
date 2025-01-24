public class CurrencyConverter implements Converter{

    double amount;

    public CurrencyConverter(double amount){
        this.amount = amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
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

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(1);
        System.out.println(converter.convertToEuro(converter.amount));
        System.out.println(converter.convertToUSD(converter.amount));
        System.out.println(converter.getConversionRate("USD"));

    }
}
