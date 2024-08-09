import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();
        
        
        System.out.println(
            "Olá " +nome+ "! Obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ 
        ", conta " +numero+ " e seu saldo " +saldo+ " já está disponivél para saque.");
        
    }
}

