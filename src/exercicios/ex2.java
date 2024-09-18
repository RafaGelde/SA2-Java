package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[4];
        int soma = 0, média = 0;
       for (int i = 0; i < 4; i++) {
                System.out.println("Digite o " + (i + 1) + "º numero");
                num[i] = scan.nextInt();
        }
        double media = Arrays.stream(num).average().orElse(Double.NaN);
        String texto = (media > 1) ? "Positivo": "Negativo";

        System.out.println(texto);

        scan.close();
    }
}
