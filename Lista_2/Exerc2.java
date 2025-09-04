import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args){
	double a,b;
	Scanner teclado = new Scanner(System.in);
	System.out.print("me dê dois números: \n");
	a = teclado.nextDouble();
	b = teclado.nextDouble();
    double s = a + b;
    double dif = a-b;
    double dif2 = b-a;
    double r1 = a/b;
    double r2 = b/a;
	teclado.close();
	System.out.print("a soma é: "+s+
	"\na subtração a-b é: "+dif+
	"\nb-a é: " +dif2+ 
	"\na multiplicação deles é: " + (a*b) + 
	"\na/b: "+r1+
	"\npor fim b/a: "+r2);
	}
}