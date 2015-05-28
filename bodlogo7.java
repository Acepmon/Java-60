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
public class bodlogo7 {
    static int[][] massive = {
        { 1, 2, 3, 4}, 
        { 5, 6, 7, 8},
        { 9,10,11,12},
        {13,14,15,16},
    };
    
    public static void main(String[] args) {
//        @reverse
//        for (int i = 0; i <=1; i++) {
//            for (int j = 0; j <=4; j++) {
//                int temp = massive[i][j];
//                massive[i][j]=massive[3-i][4-j];
//                massive[3-i][4-j] = temp;
//            }
//        }
//        for (int i = 0; i <=3; i++) {
//            for (int j = 0; j <=4; j++) {
//                System.out.print(massive[i][j]+",");
//            }
//            System.out.println("\n");
//        }
        
        for (int i = 0; i<=3; i++) {
            for (int j = i; j<=3; j++) {
                int temp = massive[i][j];
                massive[i][j]=massive[j][i];
                massive[j][i] = temp;
            }
        }
        for (int i = 0; i <=3; i++) {
            for (int j = 0; j <=3; j++) {
                System.out.print(massive[i][j]+",");
            }
            System.out.println("\n");
        }
        
        
    }
    
}
