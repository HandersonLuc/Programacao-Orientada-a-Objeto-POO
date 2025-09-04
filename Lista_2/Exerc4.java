import java.util.Scanner;

public class Exerc4 {public static void main(String[] args){
	float d, t, g;
	Scanner teclado = new Scanner(System.in);
	System.out.print("distância: \n Tempo: \n quantidade de gasolina consumida: \n");
	d = teclado.nextFloat();
	t= teclado.nextFloat();
	g= teclado.nextFloat();
	teclado.close();
	System.out.print("velocidade media(Km/h): "+d/t+
	"\nconsumo de Combustivel(Km/l): " +d/g);
	}
}