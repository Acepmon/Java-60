package bodlogogesen;

public class Bodlogo8 {
        public static void main(String[] args){

int[][] a = { { 20, 556, 44, 123 }, { 123, 5479, 568, 4053 } };

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
        System.out.println("Мөрийн хамгийн их " + maxInRow);
        System.out.println("Мөрийн хамгийн бага " + minInRow);
        minInRow = a[i][0];
        
        System.out.println("Мөрөнд байрлах хамгийн их "+i);
        
        maxInRow = a[i][0];
        System.out.println("Мөрөнд байрлах хамгийн их "+ i);
    }
    
    for (int[] row : a) {
        System.out.println("\n");
        for (int col : row) {
            System.out.print(col + "\n");
        }
    }
        
    }
}
