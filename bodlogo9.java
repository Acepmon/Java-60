/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodlogo;

import java.util.Scanner;

/**
 *
 * @author JAVA M2
 */
public class bodlogo9 {
    public static void main(String[] args) {
        int n=2;
        int noCounter=0;
        int yesCounter=0;
        String counter;
        String[] question = new String[n];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Asuult oruulah :\n");
            question[i]=input.nextLine();           
        }
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Asuult:"+question[i]+"\n");

            do{
                counter = input.nextLine();
                if (counter.equals("1"))
                    yesCounter++;
                else if (counter.equals("0")) noCounter ++;
                
            }
            while (counter.equals("0")||counter.equals("1"));
            System.out.println("Yes :" + yesCounter);
            System.out.println("No :"+ noCounter);
            yesCounter=0;
            noCounter=0;

        }
    }
    
}
