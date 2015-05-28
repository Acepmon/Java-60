package daalgawar;
import java.util.Scanner;

public class Bodlogo28 {

    public static void main(String[] args) {
        int number; 

        Scanner in = new Scanner(System.in);

        System.out.println("Тоогоо оруул");
        number = in.nextInt();

        if (number < 0) {
            System.out.println("Сөрөг тоо оруулсан байна");
        } else { 

            System.out.print("Таны оруулсан тоо 2тын тоололоор:");
            printBinaryform(number);
        }
    }

    private static void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return;
        }

        remainder = number %2; 
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}