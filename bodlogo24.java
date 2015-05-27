package daalgawar;
import java.util.Scanner;
class bodlogo24
{
   public static void main(String args[])
   {
      int counter, num, item, array[];
      Scanner input = new Scanner(System.in);
      System.out.println("Элементийн тоо:");
      num = input.nextInt(); 
      array = new int[num]; 
      System.out.println(num + " Тоо оруул");
      for (counter = 0; counter < num; counter++)
        array[counter] = input.nextInt();

      System.out.println("Хайх:");
      item = input.nextInt();

      for (counter = 0; counter < num; counter++)
      {
         if (array[counter] == item) 
         {
           System.out.println(item+" нь "+(counter+1)+" д байрлаж байна");
           break;
         }
      }
      if (counter == num)
        System.out.println(item +" гэдэг тоо array д байхгүй байна");
   }
}