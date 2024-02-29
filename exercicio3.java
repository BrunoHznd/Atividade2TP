package AtividadeMatrizes;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linha da matriz:");
        int li = scanner.nextInt();
        System.out.println("Digite o número de coluna da matriz:");
        int colu = scanner.nextInt();

        int[][] matriz = new int[li][colu];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < li; i++) {
            for (int j = 0; j < colu; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[][] transp = new int[colu][li];

        for (int i = 0; i < li; i++) {
            for (int j = 0; j < colu; j++) {
                transp[j][i] = matriz[i][j];
            }
        }

        System.out.println("A matriz transposta é:");
        for (int i = 0; i < colu; i++) {
            for (int j = 0; j < li; j++) {
                System.out.print(transp[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
