public class Condicional {
    public static void main(String[] args) {

        int anoDeLancamento = 1990;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento recente");
        } else {
            System.out.println("Filme retrô");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme incluido no plano");
        } else{
            System.out.println("Pagar pelo filme");
        }
    }
}
