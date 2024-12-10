import java.util.Scanner;

public class un3Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite comprimento: ");
        double C=scan.nextDouble();
        System.out.println("Digite largura: ");
        double L=scan.nextDouble();

        System.out.println("Área do terreno = " + (C*L));
        scan.close();
        
    }
    
}
