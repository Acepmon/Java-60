
import java.util.Scanner;
    public class bodlogo63 {

        public static void main(String args[]){
            Scanner in=new Scanner(System.in);
            System.out.println("Өгүүлбэр оруул");
            String s=in.nextLine();
            int res=count(s);
            System.out.println("Үгийн тоо : "+" "+res);
        }
        private static int count(String s) {
            int count=0;
            if(s.charAt(0)!=' '){
                count++;
            }
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)==' ')){
                    count++;
                }
            }
            return count;
        }


}