import java.util.Scanner;

public class Algo48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double salaMinimo,quantidade,preco,valorPago,valorDesconto = 0;

        System.out.println("\nEntre com o salario minimo: ");
        salaMinimo = sc.nextDouble();

        System.out.println("Entre com a quantidade em quilowatt: ");
        quantidade = sc.nextDouble();

        preco = salaMinimo / 700;

        valorPago = preco * quantidade;


        valorDesconto = valorPago * 0.9;

        System.out.println("\n======================================");
        System.out.println("Preço do Quilowatt: "+preco);
        System.out.println("======================================");

        System.out.println("\n======================================");
        System.out.println("Valor a ser pago: "+valorPago);
        System.out.println("======================================");

        System.out.println("\n======================================");
        System.out.println("Valor com desconto: "+valorDesconto);
        System.out.println("======================================");
    }
}