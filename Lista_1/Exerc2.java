import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        float c, f;
        System.out.print("Digite a temperatura em Celsius: ");
        c = teclado.nextFloat();
        f = (float)((c * 1.8)+32);
        teclado.close();
        System.out.println("A temperatura em Fahrenheit é: " + f +"°F");
    }
    
}
