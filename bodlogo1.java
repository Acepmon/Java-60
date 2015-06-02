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
        System.out.println("Амжилттай хариуллаа");
        
        switch (s) {
            
            case "ulaanbaatar":
                System.out.println("Чингис хаан хэдэн онд төрсөн бэ?");
                s = in.nextLine();

                switch (s) {
                    case "1162":
                        
                        System.out.println("Их монгол улс хэдэн онд байгуулагдсан бэ?");
                        s = in.nextLine();
                        System.out.println("Зөв байна");

                        switch (s) {
                            case "1206":
                                System.out.println("Арга билиг дээр дүрслэгдсэн амьтан юу вэ?");
                                s = in.nextLine();
                                System.out.println("Сайн байна");
                                
                                switch (s) {
                                    case "mori":
                                        System.out.println("Асуулт дууслаа");
                                }
                                
                                break;
                            default:
                                System.out.println("Хариулт буруу байна");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Буруу байна.");
                        break;
                }
                break;
            default:
                System.out.println("Сайн бодооч");
                break;
        }
    }

}
