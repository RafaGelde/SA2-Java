package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[20];
        int soma = 0, média = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            num[i] = scan.nextInt();
        }
        double media = Arrays.stream(num).average().orElse(Double.NaN);

        System.out.println("A média é = " +media);
        System.out.print("O maior valor é = ");
        Arrays.stream(num).max().ifPresent(System.out::println);
        System.out.print("O menor valor é = ");
        Arrays.stream(num).min().ifPresent(System.out::println);

        scan.close();
    }
}
