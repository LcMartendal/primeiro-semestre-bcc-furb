import java.util.Scanner;

public class un3Exer8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qtd de Dolares: ");
        double d=scan.nextDouble();

        System.out.println("Quantidade Dolares -> Reais = " + (d*5.00));
        scan.close();
       
    }
    
}
