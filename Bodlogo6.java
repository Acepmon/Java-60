package mainframe;

import java.util.Scanner;

public class Bodlogo6 {

    public static void main(String args[]) {
        int A[][] = new int[100][100];
        int k, m, n, i, j;
        int s = 0, x = 0;
        int B[][] = new int[100][100];
        String output = null;

        System.out.println("Moriin toogoo oruulna uu:  ");

        Scanner l = new Scanner(System.in);
        n = l.nextInt();

        System.out.println("Baganii toogoo oruulna uu: ");
        m = l.nextInt();

        System.out.println("Hasah moriin toogoo oruulna uu: ");
        k = l.nextInt();

        //anhnii massiv
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                A[i][j] = (int) (Math.random() * 10);
                output = "" + A[i][j];

                System.out.print(output + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        //mur hasah       
        for (i = 0; i < n; i++) {
            while (s < n - 1) {
                if (i != k - 1) {
                    for (j = 0, x = 0; j < m & x < m; j++, x++) {
                        B[s][x] = A[i][j];
                    }
                } else {
                    break;
                }
                s++;
                break;
            }
        }

        //Daraagiin massiv
        for (s = 0; s < n - 1; s++) {
            for (x = 0; x < m; x++) {
                output = "" + B[s][x];
                System.out.print(output + " ");
            }
            System.out.println("");
        }

    }

}
