package bodlogo;

import java.time.Clock;
import java.util.Scanner;
import static javax.management.Query.value;
import javax.swing.JOptionPane;

public class bodlogo1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Монгол улсын нийслэл юу вэ?");
        String s = in.nextLine();
        
        switch (s) {
            case "ulaanbaatar":
                System.out.println("Чингис хаан хэдэн онд төрсөн бэ?");
                
                s = in.nextLine();

                switch (s) {
                    case "1162":
                        
                        System.out.println("Их монгол улс хэдэн онд байгуулагдсан бэ?");
                        s = in.nextLine();

                        switch (s) {
                            case "1206":
                                System.out.println("Стив Жобсын анхны бүрэн угсарсан компьютер?");
                                s = in.nextLine();
                                
                                switch (s) {
                                    case "lisa":
                                        
                                }
                                break;
                            default:
                                System.out.println("Хариулт буруу байна");
                                s = in.nextLine();
                                break;
                        }
                        break;
                    default:
                        System.out.println("Буруу байна.");
                        s = in.nextLine();
                        break;
                }
                break;
            default:
                System.out.println("Сайн бодооч");
                s = in.nextLine();
                break;
        }
    }

}
