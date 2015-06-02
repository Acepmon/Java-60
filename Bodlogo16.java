
package bodlogo;


import java.util.Scanner;
 
class Bodlogo16
{
   public static void main(String args[])
   {
      int m, n, p, q, sum = 0, c, d, k;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Эхний матрицийн хэмжээг өгнө үү!");
      m = in.nextInt();
      n = in.nextInt();
 
      int first[][] = new int[m][n];
 
      System.out.println("Матрицийн элементүүдийг өгнө үү!");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            first[c][d] = in.nextInt();
 
      System.out.println("2дох матрицийн хэмжээг өгнө үү!");
      p = in.nextInt();
      q = in.nextInt();
 
      if ( n != p )
         System.out.println("2 матрицийг үржүүлэх боломжгүй.");
      else
      {
         int second[][] = new int[p][q];
         int multiply[][] = new int[m][q];
 
         System.out.println("2дох матрицийн элементүүдийг өгнө үү!");
 
         for ( c = 0 ; c < p ; c++ )
            for ( d = 0 ; d < q ; d++ )
               second[c][d] = in.nextInt();
         
         System.out.println("3дах матрицийн хэмжээг өгнө үү!");
      m = in.nextInt();
      n = in.nextInt();
 
      int third[][] = new int[m][n];
 
      System.out.println("3дах матрицийн элементүүдийг өгнө үү!");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            third[c][d] = in.nextInt();
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
            {   
               for ( k = 0 ; k < p ; k++ )
               {
                  sum = first[c][d] + second[c][k]*third[k][d];
               }
 
               multiply[c][d] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Матрицуудын үржвэр нийлбэр:-");
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
               System.out.print(multiply[c][d]+first[c][d]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}