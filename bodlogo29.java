/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*N массив, 0, 1, 2 гэсэн утгууд санамсаргүйгээр байрлана. Эрэмбэлэх*/
package problem;

/**
 *
 * @author monday363
 */
public class Problem29 {
    public static void main(String[] args) {
        int a[]={1,0,2,1,0,0,2,2,2,1};

        
        for(int i=0; i<=a.length-1;i++){
            for(int j=0; j<=a.length-1;j++ ){
                if (a[j]>a[i]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
                
        }
        for(int k=0; k<=a.length-1;k++){
            System.out.print(a[k]+",");
        }
    }
    
}
