package exercicios;

public class ex5 {
    public static void main(String[] args) {
        String nome[] = {"Rafael","Marco","Guilherme","Miguel","Marcia"};
        lista(nome);
    }
    public static void lista (String nome[]){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1+"º - "+nome[i]);
        }
    }
}
