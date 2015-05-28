
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JAVA M2
 */
public class Bodlogo19 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("N тоо : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.print("A тоо" + (n != 1 ? "нууд: " : ": "));
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.print("B тоо" + (n != 1 ? "нууд: " : ": "));
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (a[i] > b[i]) {
                    max = a[i] - b[i];
                } else {
                    max = b[i] - a[i];
                }
            } else {
                if (a[i] > b[i]) {
                    if (a[i] - b[i] > max) {
                        max = a[i] - b[i];
                    }
                } else {
                    if (b[i] - a[i] > max) {
                        max = b[i] - a[i];
                    }
                }
            }
        }
        System.out.println("Хамгийн их ялгавар: " + max);

    }
}
