import java.util.Scanner;

public class Exerc3 {public static void main(String[] args){
	long t, h, m;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Entre com o valor de t: \n");
	t = teclado.nextLong(); //pode entrar com um valor grande que não vai quebrar, i guess;
	teclado.close();
	h = t / 3600;
	t = t- (h * 3600);
	m = t/ 60;
	t = t - (m * 60);
	System.out.print(h+":"+m+
	":"+t);
	}
} 
