package exercicios;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int horas, segundo = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Voce quer converter quantas horas em segundos? :");
        horas = scan.nextInt();

        for (int i = 0; i < horas; i++) {
            segundo = segundo + 3600;
        }
        System.out.println("Sua converção resultou em :"+segundo+" segundos");
    }
}
