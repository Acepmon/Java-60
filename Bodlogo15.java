
package bodlogo;

import java.util.Scanner;

class Bodlogo15
{
   public static void main(String args[])
   {
      int m, n, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Матрицийн хэмжээг өгнө үү!");
      m = in.nextInt();
      n  = in.nextInt();
 
      int first[][] = new int[m][n];
      int second[][] = new int[m][n];
      int sum[][] = new int[m][n];
 
      System.out.println("Матрицийн элементүүдийг өгнө үү!");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            first[c][d] = in.nextInt();
 
      System.out.println("2дох матрицийн элементүүдийг өгнө үү!");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            second[c][d] = in.nextInt();
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
 
      System.out.println("Матрицуудын нийлбэр:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }
   }
}