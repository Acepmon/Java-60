/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Цифрүүдийн нийлбэр нь өгөгдсөн N тоотой тэнцэх гурван оронтой тоог олох*/
package problem;

/**
 *
 * @author monday363
 */
public class Problem27 {
    public static void main(String[] args) {
        int k = 20;
        for(int i =100; i<1000; i++){
            int j=(i/100 + (i%100)/10 + i%10);
            if (j == k)
                System.out.println(i);
        }
    }
    
}
