public class Exercicio_foreach {
    public static void main(String[] args){

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];

        }
        System.out.println(totalAlunoB / notasAlunoB.length);
        for(double notaB:  notasAlunoB){
            System.out.println(notaB + " ");
        }
    }
}
