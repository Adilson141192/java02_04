import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("******************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n******************************");

        String menu = """
                ** Digite a sua opção: **
                1 - Consultar saldo.
                2 - Transferir valor.
                3 - Receber valor.
                4 - Sair.
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
        }
    }
}