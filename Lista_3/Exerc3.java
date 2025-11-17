package Lista_3;
import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args){
        int m = 10;
        String frase;
        float f = (float)m;
        System.out.println(f); 
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Escreva uma frase ou palavra \n");
        frase = teclado.nextLine();
        System.out.printf("\n%s", frase.toUpperCase());
        System.out.printf("\n%s", frase.toLowerCase());
        frase = frase.trim();
        System.out.printf("\nO total de caracteres é %d \n", frase.length());
        teclado.close();
        int cont = 0;
        for(int i = frase.length()-1; i > -1; i--){
            System.out.printf("%c", frase.charAt(i));
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A'){
                cont++;
            }
        }
        System.out.printf("\nLetra A aparece %d vezes", cont);
    }
}
