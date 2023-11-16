import java.util.Locale;
import java.util.Scanner;

public class terminalTeste {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite sua idade: ");
        String idade = scanner.next();
        System.out.println("Sua idade é: " + idade + " anos.");


    }
}
