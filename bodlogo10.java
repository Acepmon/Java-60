/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodlogo;

import java.util.Scanner;

public class bodlogo10 {

    public static void main(String[] args) {

        int[][] length = new int[2][2];

        int a = 0, b = 0, c = 0, d = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < length.length; i++) {
            for (int j = 0; j < length[i].length; j++) {
                System.out.print(""+(i+1)+" мөрийн "+(j+1)+" дэх тоо: ");
                length[i][j] = in.nextInt();
            }
        }
        
        int negative = 0;
        int positive = 0;
        for (int i = 0; i < length.length; i++) {
            for (int j = 0; j < length[i].length; j++) {
                if (length[i][j] < 0) {
                    negative = negative + length[i][j];
                } else {
                    positive = positive + length[i][j];
                }
            }
        }

        System.out.println("Сөрөг тооны нийлбэр : " + negative);
        System.out.println("Эерэг тооны нийлбэр : " + positive);

    }

}
