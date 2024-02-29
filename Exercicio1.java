package AtividadeMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        Double[][] Matriz1 = new Double[3][3];
		        Double[][] Matriz2 = new Double[3][3];
		        Double[][] MatrizResultado = new Double[3][3];

		        for (int Li = 0; Li <= 2; Li++) {
		            for (int colu = 0; colu <= 2; colu++) {
		                System.out.println("Informe o valor Da Linha: " + (Li + 1) + " Da Coluna: " + (colu + 1) + " Da Primeira Matriz:");
		                Matriz1[Li][colu] = scanner.nextDouble();
		            }
		        }

		        for (int Li = 0; Li <= 2; Li++) {
		            for (int colu = 0; colu <= 2; colu++) {
		                System.out.println("Informe o valor Da Linha: " + (Li + 1) + " Da Coluna: " + (colu + 1) + " Da Segunda Matriz:");
		                Matriz2[Li][colu] = scanner.nextDouble();
		            }
		        }

		        scanner.close();

		        for (int Li = 0; Li <= 2; Li++) {
		            for (int colu = 0; colu <= 2; colu++) {
		                MatrizResultado[Li][colu] = Matriz1[Li][colu] + Matriz2[Li][colu];
		                System.out.print(MatrizResultado[Li][colu] + "|");
		            }
		            
		        }
		            System.out.println();
		        }
		    }
