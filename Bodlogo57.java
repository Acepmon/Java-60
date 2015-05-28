
import java.io.*;
import java.util.Scanner;

class Bodlogo57 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Тоогоо оруулна уу : ");
        n = scan.nextInt();

        System.out.print("Анхны тоон задрал " + n + " бол : ");

        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            } else {
                i++;
            }
        }
    }
}
