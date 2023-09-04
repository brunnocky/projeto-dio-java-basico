import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldoDaConta;

        System.out.print("Por favor, digite o número da Conta !\n");
        numeroConta = input.nextInt();
        input.nextLine();

        System.out.print("Por favor, digite sua Agência de três dígitos seguido de um hífen e dígito verificador!\n");
        agencia = input.nextLine();

        System.out.print("Por favor, digite seu nome completo!\n");
        nomeCliente = input.nextLine();

        System.out.print("Por favor, insira um depósito inicial!\n");
        saldoDaConta = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", " +
                "conta " + numeroConta +" e seu saldo " + saldoDaConta +" já está disponível para saque");
    }
}
