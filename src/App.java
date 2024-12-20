public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento:" + anoDeLancamento );
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println("Nota do filme" + media);
        String sinopse;
        sinopse = """
        Filme: Top Gun: Maverick
        Filme de aventura com galã dos anos 80
        Muito Bom!
        Ano de Lançamento:
        """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

        Double tempCelcius = 32.2;
        Double tempFahrenheit = (tempCelcius * 1.8) + 32;
        String temperatura = """
        Temperatura em Celcius: %s
        Temperatura em Fahrenheit: %.1f
        """.formatted(tempCelcius, tempFahrenheit);
        System.out.println(temperatura);
    }
}
