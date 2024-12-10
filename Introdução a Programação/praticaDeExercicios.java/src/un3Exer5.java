import java.util.Scanner;

public class un3Exer5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a qtd de frangos: ");
        int qtdF=scan.nextInt();
        double gT;

        System.out.println("Gasto total: " + (gT=((qtdF*4)+(qtdF*(3.50*2)))));
        scan.close();
    }
    
}
