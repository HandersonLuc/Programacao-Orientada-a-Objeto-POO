import java.util.Scanner;

public class Exerc1{
    public static void main (String[] args){
	int a,b;
	Scanner teclado = new Scanner(System.in);
	System.out.print("me dê dois números: \n");
	a = teclado.nextInt();
	b = teclado.nextInt();
	teclado.close();
	System.out.print("a soma é: "+(a+b)+
	"\na subtração a-b é: "+(a-b)+
	"\nb-a é: " + (b-a)+ 
	"\na multiplicação deles é: " + (a*b) + 
	"\na/b: "+(a/b)+
	"\npor fim b/a: "+(b/a));
    } 
} 
