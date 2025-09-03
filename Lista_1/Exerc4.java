package Lista_1;
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args){
        int c;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite os centavos: ");
        c= teclado.nextInt();
        teclado.close();
        while (c >= 100){
            int r;
            r = c / 100;
            System.out.print(r+" moedas de um real ");
            c = c - (r * 100);
        }
        while( c >= 50){
            int r;
            r = c / 50;
            System.out.print(r+" moedas de cincuenta centavos ");
            c = c - (r * 50);
        }
        while( c >= 25){
            int r;
            r = c / 25;
            System.out.print(r+" moedas de veinticinco centavos ");
            c = c - (r * 25);
        }
        while( c >= 10){
            int r;
            r = c / 10;
            System.out.print(r+" moedas de dez centavos ");
            c = c - (r * 10);
        }
        while( c >= 5){
            int r;
            r = c / 5;
            System.out.print(r+" moedas de cinco centavos ");
            c = c - (r * 5);
        }
        while( c >= 1){
            int r;
            r = c / 1;
            System.out.print(r+" moedas de 1 centavo ");
            c = c - (r * 1);
        }
    }
    
}
