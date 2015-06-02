package bodlogo;

import java.util.Random;
import java.util.Scanner;

public class Bodlogo39 {
    public static void main(String[] args) {
        int c=0, b=0;
        int max=0,min=0;
        int row=0, column=0;
        Random random = new Random();
        //гараас мөр баганын тоо оруулах
        Scanner input = new Scanner(System.in);
        System.out.println("Мөрийн дугаар :");
        b = input.nextInt();
        System.out.println("Баганын дугаар :");
        c = input.nextInt();
        
        int a[][] = new int[b][c];
        //тоонуудыг оруулах
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                //System.out.println("a["+i+"]["+j+"]=");
                a[i][j]=random.nextInt(1000);
                //a[i][j]= input.nextInt();
            }            
        }
        //хэвлэх
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] +", ");
            }
            System.out.println("");
        }
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < b; j++) {
                if (max<a[j][i]) {
                    max=a[j][i];
                    min=a[j][i];
                    row=j;
                    column=i;
                }

            }
            System.out.println("Max:"+max+", Row:"+row+", in Column:"+column);
            for (int k = 0; k < c; k++) {
                if(min>a[row][k]){
                    min=a[row][k];
                    column = k;
                }
            }
            System.out.println("Max:"+min+",in Row:"+row+", Column:"+column);
            if(min==max){
                System.out.println("Мөр :"+row+"Багана :"+column);
            }
            else System.out.println(0);
            max=0;
        }
    }

}
