import java.util.Scanner;

public class Exerc5 {public static void main(String[] args){
	double x1,y1,x2,y2,x3,y3, l1, l2,l3;
	System.out.print("me dê as coordenadas a \nb \nc \n");
	Scanner teclado = new Scanner(System.in);
	System.out.print("x1: ");
	x1 = teclado.nextInt();
    System.out.print("\ny1: ");
	y1 = teclado.nextInt();
    System.out.print("\nx2: ");
	x2 = teclado.nextInt();
    System.out.print("\ny2: ");
	y2 = teclado.nextInt();
    System.out.print("\nx3: ");
	x3 = teclado.nextInt();
    System.out.print("\ny3: ");
	y3 = teclado.nextInt();
	teclado.close();
	l1 = Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1,2));
	l2 = Math.sqrt(Math.pow(x3-x2, 2)+ Math.pow(y3-y2,2));
	l3 = Math.sqrt(Math.pow(x1-x3, 2)+ Math.pow(y1-y3,2));
	if(l1==l2 && l2==l3)System.out.print("triângulo equilatero");
    else if (l1 != l2 && l2 != l3 && l3 != l1)System.out.print("triângulo escaleno");
	else if(l1 != l2 || l2!=l3 || l3 != l1)System.out.print("triângulo isósceles");
    else System.out.print("não é um triângulo");
}} 
