import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args){
        String nome;
        int q;
        float preço, total;
        System.out.print("Nome do produto: \nPreço unitário: \nQuantidade comprada: \n");
        Scanner teclado = new Scanner(System.in);
        nome = teclado.next();
        preço = teclado.nextFloat();
        q = teclado.nextInt();
        teclado.close();
        if (q <= 10) {
            total = preço * q;
            System.out.print("produto: "+ nome);
            System.out.print("\nTotal a pagar: " + total);
        }
        else if(q > 10 && q <= 20){
            total = (preço * q) * 0.9f;
            System.out.print("produto: "+ nome);
            System.out.print("\nTotal a pagar: " + total);
        }
        else if(q > 20 && q <= 50){
            total = (preço * q) * 0.8f;
            System.out.print("produto: "+ nome);
            System.out.print("\nTotal a pagar: " + total);
        }
        else{
            total = (preço * q) * 0.75f;
            System.out.print("produto: "+ nome);
            System.out.print("\nTotal a pagar: " + total);
        }
    }
} 
