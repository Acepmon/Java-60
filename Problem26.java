/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//A(M) массивт өгөгдсөн тоонуудаас хоорондоо ялгаатай тоо хэд байгааг тодорхойлох
package problem;


/**
 *
 * @author monday363
 */
public class Problem26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {6, 2, 3, 3, 4, 5, 5, 6, 2, 7, 9};
        int count=0;
        // TODO code application logic here
        for(int i=0; i<a.length; i++){
            for(int j=0; j<i; j++){
                if (a[i]==a[j])count++;                         
            }
            if (count == 0) 
                {
                    System.out.print(a[i]+",");
   
                }
                count=0;
            
        }
    }
}
