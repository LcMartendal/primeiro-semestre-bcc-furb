import java.util.Scanner;

public class un3Exer3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double qtdL;

        System.out.println("Diigite o preço do L do combustivel: ");
        double pLG=scan.nextDouble();
        System.out.println("Insira o valor pago no abastecimento: ");
        double vP=scan.nextDouble();

        System.out.println("A quantidade de Litros do abastecimento foi: " + (qtdL=(vP/pLG )));
        scan.close();
    }
    
}
