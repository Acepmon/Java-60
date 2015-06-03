
import java.util.Arrays;
import java.util.Scanner;

public class Bodlogo59 {
    
    private static String toBin(int n) {
        int r;
        if (n <= 1) {
            return ""+n;
        }
        r = n % 2;
        return toBin(n >> 1) + "" + r;
    }
    
    private static String toDec(String n) {
        double bin = 0;
        for (int a = 0; a < n.length(); a++) {
            if (n.charAt(a) == '1') {
                bin = bin + Math.pow(2, n.length()-1-a);
            }
        }
        return ""+bin;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N too: ");
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            char[] bin = toBin(i).toCharArray();
            int tmp = 0;
            int countTmp = 0;
            int count = 0;
            boolean arith_prog = false;
            for (int b = 0; b < bin.length; b++) {
                if (b == 0) {
                    tmp = bin[b];
                } else {
                    
                    if (tmp == bin[b]) {
                        count++;
                    } else {
                        if (b == bin.length-1) {
                            if (count != countTmp) {
                                arith_prog = false;
                            }
                        } else if (count != countTmp) {
                            arith_prog = false;
                            count++;
                        } else if (count == countTmp) {
                            arith_prog = true;
                            countTmp = count;
                        count = 0;
                        }
                    }
                }
            }
            
            if (arith_prog) {
                System.out.print(i + " :: ");
                String strBin = "";
                for (char c : bin) {
                    System.out.print(c);
                    strBin+=c;
                }
                System.out.print(" - " + toDec(strBin));
                System.out.println("");
            }
        }
    }
}
