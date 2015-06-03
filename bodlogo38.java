package bodlogo;

import java.util.Scanner;

public class bodlogo38 {

    public static void main(String[] args) {

        int row1 = 0;
        int mtoo;

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("М тоогоо оруулна уу?");
            String str = in.nextLine();
            try {
                mtoo = Integer.parseInt(str);
                if (row1 < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException ex) {
                System.err.println("М тоогоо зөв оруулна уу?");
            }
        } while (true);

        do {

            System.out.println("Массивын хэмжээг оруулна уу?");
            String str1 = in.nextLine();
            try {
                row1 = Integer.parseInt(str1);
                if (row1 < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException ex) {
                System.err.println("Массивын хэмжээг зөв оруулна уу?");
            }
        } while (true);

        int[] length = new int[row1];

        int last = 0;

        int module = mtoo % row1;

        int massutga = mtoo / row1;

        for (int i = 0; i < row1; i++) {

            length[i] = massutga;
            last = i;
        }
        length[last] = length[last] + module;

        System.out.println("Массивын нийлбэрийн утга: ");

        for (int i = 0; i < row1; i++) {

            System.out.print(length[i] + " ");
        }
    }
}
