package Vetores;

public class Vetor {
    public static void main(String[] args) throws Exception {
        int[] big_vetor = new int[10]; // instantiating

        big_vetor[0] = 2;
        big_vetor[1] = 4;
        big_vetor[2] = 6;
        big_vetor[3] = 46;
        big_vetor[4] = 58;
        big_vetor[5] = 231;
        big_vetor[6] = 751;
        big_vetor[7] = 32;
        big_vetor[8] = 23;
        big_vetor[9] = 25;

        // System.out.println(big_vetor[9]);

        for (int i = 0; i < big_vetor.length; i++) {
            System.out.println(big_vetor[i]);
        }
    }
}
