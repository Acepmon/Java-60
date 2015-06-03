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
public class bodlogo13 {

    public static void main(String[] args) {

        int row1 = 0;
        int countZero = 0;

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Массивийн хэмжээг оруулна уу?");
            String str = in.nextLine();
            try {
                row1 = Integer.parseInt(str);
                if (row1 < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException ex) {
                System.err.println("Массиваа зөв оруулна уу?");
            }
        } while (true);

        int[] length = new int[row1];

        System.out.println("Тоогоо оруулна уу?");

        for (int i = 0; i < row1; i++) {

            length[i] = in.nextInt();
        }

        System.out.println("Массив дахь утгууд: ");
        for (int i = 0; i < row1; i++) {
            System.out.print(length[i] + " ");
        }

        for (int i = 0; i < row1; i++) {
            for (int j = i + 1; j < row1; j++) {
                if (length[i] == length[j]) {
                    length[j] = 0;
                    countZero++;
                }
            }
        }

        for (int c = 0; c < countZero; c++) {
            for (int i = 0; i < row1; i++) {
                if (length[i] == 0 && (i + 1) != row1) {
                    int tmp = length[i];
                    length[i] = length[i + 1];
                    length[i + 1] = tmp;
                }
            }
        }

        System.out.println("\n" + "Үр дүн: ");
        for (int b = 0; b < row1; b++) {
            System.out.print(length[b] + " ");
        }
    }
}
