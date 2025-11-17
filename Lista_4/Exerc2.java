import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.printf("tamanho do vetor: \n");
        int n = tec.nextInt();
        int vet[] = new int[n];
        boolean achou = false;
        for(int i = 0; i < n; i++){
            System.out.printf("valor a ser colocado na pos %d:\n", i);
            vet[i] = tec.nextInt(); 
        }
        System.out.printf("valor k a ser procurado: ");
        int k = tec.nextInt();
        for(int i = 0; i < n; i++) {
            if(k == vet[i]){ 
                System.out.printf("ele está na posicao: %d", i);
                achou = true;
            }
        }
        if(achou == false) System.out.printf("Número não encontrado");
        tec.close();
    }
}
