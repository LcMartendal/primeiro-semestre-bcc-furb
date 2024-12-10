import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni03Exe03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double qtdL;

        System.out.println("Diigite o preço do L do combustivel: ");
        double pLG=scan.nextDouble();
        System.out.println("Insira o valor pago no abastecimento: ");
        double vP=scan.nextDouble();

        System.out.println("A quantidade de Litros do abastecimento foi: " + df.format((qtdL=(vP/pLG ))));
        scan.close();
        
    }
}
