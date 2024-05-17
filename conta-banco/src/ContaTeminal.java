import java.util.Locale;
import java.util.Scanner;

public class ContaTeminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
       System.out.println("Por favor, digite o Nome do Usuário !");
       String usuario = scanner.next();
       
       System.out.println("Por favor, digite o número da Conta !");
       int conta = scanner.nextInt();

       System.out.println("Por favor, digite o número da Agência !");
       String agencia = scanner.next();

       System.out.println("Por favor, digite o Saldo !");
       double saldo = scanner.nextDouble();

       System.out.println("Olá " + usuario + " obrigado por criar uma conta em nosso banco, " );
       System.out.println("sua agência é " + agencia + ", Conta " + conta + ", e seu saldo " + saldo + " já está dispinível para saque");
      
     }

}
