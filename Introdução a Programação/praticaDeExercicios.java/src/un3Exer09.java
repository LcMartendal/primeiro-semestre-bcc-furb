import java.text.DecimalFormat;
import java.util.Scanner;

public class un3Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("0.00");

        
        double raio=scan.nextDouble();
        double altura=scan.nextDouble();

        double volume = (3.14159265358979 * Math.pow(raio, 2)*altura);

        System.out.println("Volume = " + df2.format(volume));
        scan.close();
    }
    
}
