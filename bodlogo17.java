/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodlogo;

import java.util.Scanner;

/**
 *
 * @author JAVA M2
 */
public class bodlogo17 {

    public static void main(String[] args) {

        int row1 = 1;

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Массивын хэмжээг оруулна уу?");
            String str = in.nextLine();
            try {
                row1 = Integer.parseInt(str);
                if (row1 < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException ex) {
                System.err.println("Массивын хэмжээг зөв оруулна уу?");
            }
        } while (true);

        int[][] length = new int[row1][row1];

        for (int i = 0; i < row1; i++) {

            for (int j = 0; j < row1; j++) {
                System.out.print("" + (i + 1) + " мөрийн " + (j + 1) + " дэх тоо: ");
                length[i][j] = in.nextInt();

            }
        }

        for (int i = 0; i < row1; i++) {
            for (int b = 0; b < length[i].length; b++) {
                length[i][b] = 0;
            }
            int j = i;
            length[i][j] = 1;
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < row1; j++) {
                System.out.print(length[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
