
package bodlogo;


import java.util.Scanner;
 
class Bodlogo18
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
 
//      System.out.println("2дох матрицийн хэмжээг өгнө үү!");
//      p = in.nextInt();
//      q = in.nextInt();
// 
//      if ( n != p )
//         System.out.println("2 матрицийг үржүүлэх боломжгүй.");
//      else
//      {
//         int second[][] = new int[p][q];
         int multiply[][] = new int[m][n];
// 
//         System.out.println("2дох матрицийн элементүүдийг өгнө үү!");
// 
//         for ( c = 0 ; c < p ; c++ )
//            for ( d = 0 ; d < q ; d++ )
//               second[c][d] = in.nextInt();
         
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < n ; d++ )
            {   
               for ( k = 0 ; k < n ; k++ )
               {
                  sum = (first[c][k]*first[k][d]*first[c][d])-2*(first[c][k]*first[k][d])-9*(first[c][d]);
               }
 
               multiply[c][d] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Матрицуудын үржвэр:-");
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < n ; d++ )
               System.out.print(multiply[c][d]+"\t");
 
            System.out.print("\n");
         }
         
         for ( c = 0 ; c < m ; c++ )
         {
      }
   }
   }
