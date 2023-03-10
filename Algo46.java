import java.util.Scanner;

public class Algo46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo,novoSaldo;

        System.out.println("\nDigite o valor do saldo: ");
        saldo = sc.nextDouble();

        novoSaldo = saldo * 1.01;

        System.out.println("\nO novo valor do saldo é: "+novoSaldo);
    }
}