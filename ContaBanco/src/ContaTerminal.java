import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Óla " + nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                agencia + ", conta " + conta + " e seu saldo " + saldo +
                " já está disponível para saque.");
        scanner.close();
    }
}
