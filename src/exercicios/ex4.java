package exercicios;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        tamanholinha();
    }
    public static void tamanholinha() {
        int tamanho = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual tamanho da linha voce quer?");
        tamanho = scan.nextInt();

        underline(tamanho);
    }
    public static void underline(int tamanho) {
        for (int i = 0; i <= tamanho-1 ; i++) {
            System.out.print("_");
        }
    }
}
