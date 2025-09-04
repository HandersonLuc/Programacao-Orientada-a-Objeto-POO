import java.util.Scanner;

public class Exerc7 {
    public static void main(String[] args){
        int
         n, menor, maior;
        Scanner teclado = new Scanner(System.in); 
        System.out.print("informe n: \n");
        n = teclado.nextInt();
        System.out.print("informe o menor valor: \n");
        menor = teclado.nextInt();
        System.out.print("informe o maior valor: \n");
        maior = teclado.nextInt();
        teclado.close();
        if (n<menor)System.out.print("n está antes do intervalo");
        else if (n>maior) System.out.print("n está depois do intervalo");
        else System.out.print("n está dentro do intervalo");
    }
}
