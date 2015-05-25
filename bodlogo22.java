/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daalgawar;
import java.util.Scanner;
class boldogo22
{
   public static void main (String[] args)
   {		
      Scanner scanner = new Scanner(System.in);
      int i =0;
      int num =0;
      String  primeNumbers = "";
      System.out.println("M ын утга:");
      int m = scanner.nextInt();
      for (i = 1; i <= m; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
	    if(i%num==0)
	    {
	counter = counter + 1;
	    }
	 }
	 if (counter ==2)
	 {
	    primeNumbers = primeNumbers + i + " ";
	 }	
      }	
      System.out.println("1 ээс M хүртэлх анхны тоонууд :");
      System.out.println(primeNumbers);
   }
}