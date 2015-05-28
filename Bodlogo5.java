package bodlogogesen;

import java.util.Arrays;
import java.util.Iterator;

public class Bodlogo5 {

    
    public static void main(String[] args){

int[][] a = { { 0,2, 1, 4, 5 }, { 3, 9, 8, 43 } };

    for (int i = 0; i < a.length; i++) {
        int minInRow = a[i][0];
        int maxInRow = a[i][0];
        for (int j = 0; j < a[i].length; j++) {
            if (minInRow > a[i][j]) {
                minInRow = a[i][j];
            }

            if (maxInRow < a[i][j]) {
                maxInRow = a[i][j];
            }
        }
        System.out.println("Мөрийн их " + maxInRow);
        System.out.println("Мөрийн хамгийн бага " + minInRow);
        minInRow = a[i][0];
        maxInRow = a[i][0];
    }
    

        
    }
}

