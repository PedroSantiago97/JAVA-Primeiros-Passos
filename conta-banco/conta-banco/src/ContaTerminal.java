
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try{
        System.out.println("Bem vindo ao Banco Dinheiro no bolso!");
        System.out.printf("Digite sua conta: ");
        int conta = scanner.nextInt();
        
        System.out.printf("Digite sua Agencia: ");
        String agencia = scanner.next();
        System.out.printf("Digite o Digito: ");
        String digitoAgencia = scanner.next();

        System.out.printf("Digite seu nome: ");
        String nomeCliente = scanner.next();
        System.out.printf("Digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.printf("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é "+ agencia+"-"+digitoAgencia + " conta " + conta + " e seu saldo que é de R$" + String.format("%.2f", saldo) + " ja está disponível !");
        } finally{scanner.close();}
    }
}
