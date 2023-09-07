import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o tamanho do vetor");
        double[] nota = new double[sc.nextInt()];

        System.out.println(Arrays.toString(nota));

        System.out.println("Informe as notas");
        for(int i = 0; i < nota.length; i++){
            nota[i] = sc.nextDouble();


        }
        double total = 0;
        for(double notaTotal: nota ){
            total += notaTotal;
        }
        System.out.println(total);
        System.out.println(total / nota.length);
        System.out.println(Arrays.toString(nota));

    }
}
