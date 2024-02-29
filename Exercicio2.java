package AtividadeMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String[][] matrizUsuario = new String[5][2];


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o login " + (i + 1) + ":");
            matrizUsuario[i][0] = scanner.nextLine();

            System.out.println("Digite a senha " + (i + 1) + ":");
            matrizUsuario[i][1] = scanner.nextLine();
        }


        System.out.println("Digite o login a ser verificado:");
        String loginVerificar = scanner.nextLine();

        System.out.println("Digite a senha a ser verificada:");
        String senhaVerificar = scanner.nextLine();

     
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            if (loginVerificar.equals(matrizUsuario[i][0]) && senhaVerificar.equals(matrizUsuario[i][1])) {
                encontrado = true;
                break;
            }
        }


        if (encontrado) {
            System.out.println("Login e senha válidos.");
        } else {
            System.out.println("Login e/ou senha inválidos.");
        }

        scanner.close();

	}

}
