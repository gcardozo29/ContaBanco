import java.util.Scanner;
public class BancoTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        String Agencia, NomeCliente;
        Double Saldo;


        System.out.println("-------------Banco-------------");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Olá, seja bem vindo ao nosso Banco. Por favor, digite seu nome: ");
        NomeCliente = input.next();

        System.out.println(NomeCliente + "Por favor, digite o numero de sua agencia: ");
        numero = input.nextInt();

        System.out.println("Agora deposite um valor inicial: ");
        Saldo = input.nextDouble();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(NomeCliente+ " Sua agencia é " + numero + " e seu saldo atual é de " + Saldo+".");
    }
}