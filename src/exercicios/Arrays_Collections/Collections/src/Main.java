public class Main {
    public static void main(String[] args) {
        //foreach
        double[] notas = {9.9, 8.7, 7.2, 9.4};
        for(int i = 0; i<notas.length; i++){
            System.out.println(notas[i]);

        }

        for(double nota: notas){
            System.out.print(nota + " ");
        }

    }
}