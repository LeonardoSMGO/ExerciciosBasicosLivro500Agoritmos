import java.util.Scanner;

public class Algo40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quociente,resto,dividendo,divisor;

        System.out.println("Entre com o dividendo: ");
        dividendo = sc.nextInt();

        System.out.println("Entre com o divisor: ");
        divisor = sc.nextInt();

        quociente = dividendo / divisor;

        resto = dividendo % divisor;

        System.out.println("\nDividendo: "+dividendo);
        System.out.println("=============");
        System.out.println("Divisor: "+divisor);
        System.out.println("=============");
        System.out.println("Quociente: "+quociente);
        System.out.println("=============");
        System.out.println("Resto: "+resto);
        System.out.println("=============");
    }
}