// importar a classe Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Obter pela Scanner os valores digitados no terminal
        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");

        scanner.close();
    }
}