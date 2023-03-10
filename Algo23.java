import java.util.Scanner;

public class Algo23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valor;

        System.out.println("Digite um numero com tres casas: ");
        valor = sc.nextInt();


        int divisao = valor % 100 / 10;
        System.out.println("Algoritmo da casa das dezenas: "+ divisao);
    }
}