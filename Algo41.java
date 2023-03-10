import java.util.Scanner;

public class Algo41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double valor1,valor2,valor3,valor4,mediaPonderada;

        System.out.println("================================");
        System.out.println("Entre com o primeiro valor");
        valor1 = sc.nextDouble();

        System.out.println("================================");
        System.out.println("Entre com o segundo valor");
        valor2 = sc.nextDouble();

        System.out.println("================================");
        System.out.println("Entre com o terceiro valor");
        valor3 = sc.nextDouble();

        System.out.println("================================");
        System.out.println("Entre com o quarto valor");
        valor4 = sc.nextDouble();

        mediaPonderada = (valor1 * 1 + valor2 * 2 + valor3 * 3 + valor4 * 4) / 10;
        System.out.println("\nA sua média ponderada é: "+mediaPonderada);
    }
}