public class CalculoTemperatura {
    public static void main(String[] args) throws Exception {
        
        Double tempCelcius = 32.2;
        Double tempFahrenheit = (tempCelcius * 1.8) + 32;
        String temperatura = """
        Temperatura em Celcius: %s
        Temperatura em Fahrenheit: %.1f
        """.formatted(tempCelcius, tempFahrenheit);
        System.out.println(temperatura);    
    }
}
