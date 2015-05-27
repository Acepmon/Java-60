package daalgawar;
import java.util.Scanner;
public class bodlogo2
{
        public static void main(String []args)
        {
int c = 0;
                Scanner scan = new Scanner ( System.in );
 
                System.out.println("What's 2 + 2");
                System.out.println("4");
                System.out.println("2");
                System.out.println("1");
                System.out.println("3\n");
 
                String in;
                in = scan.nextLine();
 
 
                if(in.equals("4"))
                {
                        System.out.println("Зөв байна\n");
                        c++;
                }
 
                else
                {
                        System.out.println("Сайн бод\n");
                        System.out.println("\nЗөв хариулт 4");
                }
 
                System.out.println("What Language Is This Coded In?\n");
 
                System.out.println("C");
                System.out.println("C++");
                System.out.println("Java");
                System.out.println("PC");
 
                in=scan.nextLine();
 
                if(in.equalsIgnoreCase("Java"))
                                {
                                        System.out.println("Зөв байна");
                                        c++;
                                }
 
                                else
                                {
                                        System.out.println("Буруу");
                                        System.out.println("\nЗөв хариулт Java");
                                }
                 System.out.println("\nwhat's 5+6?\n");
 
                System.out.println("23");
                System.out.println("54");
                System.out.println("77");
                System.out.println("11");
 
                in=scan.nextLine();
 
                if(in.equalsIgnoreCase("11"))
                                {
                                        System.out.println("Зөв байна");
                                        c++;
                                }
 
                                else
                                {
                                        System.out.println("Буруу");
                                        System.out.println("\nЗөв хариулт 11");
                                }
                System.out.println("\nwhat's 2+5\n");
 
                System.out.println("5");
                System.out.println("6");
                System.out.println("7");
                System.out.println("8");
 
                in=scan.nextLine();
 
                if(in.equalsIgnoreCase("7"))
                                {
                                        System.out.println("Зөв байна");
                                        c++;
                                }
 
                                else
                                {
                                        System.out.println("Буруу");
                                        System.out.println("\nЗөв хариулт 7");
                                }
                System.out.println("\nblue + yellow = ?\n");
 
                System.out.println("purple");
                System.out.println("green");
                System.out.println("red");
                System.out.println("sky blue");
 
                in=scan.nextLine();
 
                if(in.equalsIgnoreCase("green"))
                                {
                                        System.out.println("Зөв байна");
                                        c++;
                                }
 
                                else
                                {
                                        System.out.println("Харамсалтай байна");
                                        System.out.println("\nЗөв хариулт green");
                                }
 
                                System.out.println(" 5 Аас "+c+" зөв");
 
                                System.out.println(100 * c/5 + "%");
 
        }
}