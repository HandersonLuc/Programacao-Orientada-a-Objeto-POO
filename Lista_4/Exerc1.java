import java.util.Scanner;
public class Exerc1 {
    public static void main(String[] args){
        int num; // numero de alunos
        Scanner t = new Scanner(System.in);
        System.out.printf("quantos alunos ? \n");
        num = t.nextInt();
        float media = 0;
        float [] notas = new float[num];
        for(int i = 0; i < num; i++ ){
            System.out.printf("nota do aluno: %d \n", i);
            notas[i] = t.nextFloat();
            media += notas[i]; 
        }
        media = media/num;
        System.out.printf("a media foi %.2f \n", media);
        for(int i = 0; i < num; i++){
            if(notas[i] > media) System.out.printf("a nota do aluno %d é %.2f \n", i, notas[i]);
        }
        t.close();
    }

}
