import java.util.Scanner;

public class Algo44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double logaritimo,num,base;

        System.out.println("\n==========================");
        System.out.println("Entre com o logaritimo:");
        num = sc.nextDouble();

        System.out.println("\n==========================");
        System.out.println("Entre com o valor da base:");
        base = sc.nextDouble();

        logaritimo = Math.log(num) / Math.log(base);

        System.out.println("\n===================================");
        System.out.println("Seu logaritimo é: "+logaritimo);
        System.out.println("===================================");
    }
    
}
