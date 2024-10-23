package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê os valores de M e N
        int M = sc.nextInt();
        int N = sc.nextInt();

        // Cria a matriz
        int[][] mat = new int[M][N];

        // Lê a matriz
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Lê o número X
        int X = sc.nextInt();

        // Percorre a matriz para encontrar as ocorrências de X
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] == X) {
                    System.out.printf("Position %d,%d:%n", i, j);

                    // Verifica e imprime valores à esquerda
                    if (j > 0) {
                        System.out.printf("Left: %d%n", mat[i][j-1]);
                    }

                    // Verifica e imprime valores à direita
                    if (j < N - 1) {
                        System.out.printf("Right: %d%n", mat[i][j+1]);
                    }

                    // Verifica e imprime valores acima
                    if (i > 0) {
                        System.out.printf("Up: %d%n", mat[i-1][j]);
                    }

                    // Verifica e imprime valores abaixo
                    if (i < M - 1) {
                        System.out.printf("Down: %d%n", mat[i+1][j]);
                    }

                    System.out.println();  // Linha em branco para separar as ocorrências
                }
            }
        }

        sc.close();
    }
}