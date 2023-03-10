import java.util.Scanner;

public class Algo43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double  num,logaritimo;

        System.out.println("\nDigite o valor do logaritimo: ");
        num = sc.nextDouble();

        logaritimo = Math.log(num) / Math.log(10);
        System.out.println("\nSeu logaritimo é: "+logaritimo);        
    }
}
