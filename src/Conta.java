import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        
        String cliente = "Jaqueline Oliveira";
        String contaTipo = "Corrente";
        Double saldo = 2500.00;
        int opcao = 0;
        Double receber = 0.0;
        Double transferir = 0.0;

        String prefilConta = """
        *************************************
        Dados iniciais do cliente:

        Nome: %s
        Tipo conta: %s
        Saldo inicial: %s
        *************************************
        """.formatted(cliente, contaTipo, saldo);
    
        System.out.println(prefilConta);

        String operacoes = """

        Operações:

        1- Consultar saldos
        2- Receber valor
        3- Transferir valor
        4- Sair

        Digite a opção desejada:
        """;

        while (opcao != 4) {
            
            System.out.println(operacoes);

            opcao = leitura.nextInt();

            switch(opcao){

                case 1 -> System.out.println("O saldo atual é R$:" + saldo);

                case 2 -> {
                    System.out.println("Informe o valor a receber:");
                    receber = leitura.nextDouble();
                    saldo += receber;
                    System.out.println("O saldo atual é R$:" + saldo);
                }

                case 3 -> {
                    System.out.println("Qual valor deseja transferir:");
                    transferir = leitura.nextDouble();
                    if(saldo >= transferir){
                        saldo -= transferir;
                    }else{
                        System.out.println("Você não possuí saldo suficiente para fazer a transferencia");
                    }
                    System.out.println("O saldo atual é R$:" + saldo);
                    break;
                }

                case 4 -> System.out.println("Obrigado por utilizar nosso sistema");

            }
            
        }
    }

    
}
