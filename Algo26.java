import java.util.Scanner;

public class Algo26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int data,dia,mes,ano,numData;

        System.out.println("Digite a data no formato dd/mm/aa:");
        data = sc.nextInt();


        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;

        numData = mes * 10000 + dia * 100 + ano;

        System.out.println("Dia: "+dia);
        System.out.println("==========");

        System.out.println("Dia: "+mes);
        System.out.println("==========");

        System.out.println("Mês: "+ano);

        System.out.println("\nData no formato dd/mm/aa: "+numData);
    }
}