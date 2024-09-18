package exercicios;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int[] L = {5, 7, 2, 9, 4, 1, 3};
        int ponteiro = 7, Aux;

        System.out.println("Tamanho da lista = "+ ponteiro);
        System.out.print("Maior valor = ");
        Arrays.stream(L).max().ifPresent(System.out::println);
        System.out.print("Menor Valor = ");
        Arrays.stream(L).min().ifPresent(System.out::println);
        System.out.println("Soma dos numeros = "+Arrays.stream(L).sum());
        for (int i = 0; i < L.length; i++) {
            for (int j = 0; j < L.length-1; j++) {
                if (L[i] < L[j]){
                    Aux  =  L[i];
                    L[i] =  L[j];
                    L[j] =  Aux;
                }
            }
        }
        System.out.print("Ordem crescente = ");
        for (int i = 0; i < L.length; i++) {
            System.out.print(L[i]);
        }
        System.out.println("");
        for (int i = 0; i < L.length; i++) {
            for (int j = 0; j < L.length-1; j++) {
                if (L[i] > L[j]){
                    Aux  =  L[i];
                    L[i] =  L[j];
                    L[j] =  Aux;
                }
            }
        }
        System.out.print("Ordem decrescente = ");
        for (int i = 0; i < L.length; i++) {
            System.out.print(L[i]);
        }
    }
}