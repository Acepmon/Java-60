/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Аравтын системд байгаа өгөгдсөн М натураль тоог хоёртын системд шилжүүл*/
package problem;

/**
 *
 * @author monday363
 */
public class Problem28 {
    public static void main(String[] args) {
        int k = 70;
        String number = "";
        String reverse = "";
        while (k!=0) {
            int digit = k%2;
            k=k/2;
            if(digit==1)
                number = number+"1";
            else
                number = number+"0";
        }
        for (int i = number.length()-1; i>=0; i--)
            reverse = reverse + number.charAt(i);
        System.out.println(reverse);
    }
    
}
