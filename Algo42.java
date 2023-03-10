import java.util.Locale;
import java.util.Scanner;

public class Algo42 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double angulo,rang;

        System.out.println("================================");
        System.out.println("Digite um angulo em graus: ");
        angulo = sc.nextDouble();

        rang = angulo * 3.14 / 180;

        System.out.println("================================");
        System.out.println("\nSeno: "+Math.sin(rang));
        System.out.println("================================");
        System.out.println("\nCossenno: "+Math.cos(rang));
        System.out.println("================================");
        System.out.println("\nTangente: "+Math.tan(rang));
        System.out.println("================================");
        System.out.println("\nSecante: "+ 1/Math.cos(rang));
        System.out.println("================================");
        System.out.println("\nCo-Secante: "+ 1/ Math.sin(rang));
        System.out.println("================================");
        System.out.println("\nCo-Tangente: "+ 1/Math.tan(rang));
        System.out.println("================================");
    }
}