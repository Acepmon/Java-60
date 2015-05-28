package BieDaalt;

import java.util.*;

class Bodlogo32
{
  public static void main(String args[])
  {
    int[] Array = { 1, 2, 1, 4, 1, 6, 1, 8, 1, 10 };

    shuffleArray(Array);
    for (int i = 0; i < Array.length; i++)
    {
      System.out.print(Array[i] + " ");
    }
    System.out.println();
  }  
  static void shuffleArray(int[] ar)
  {
    Random rnd = new Random();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);      
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }
}
    

