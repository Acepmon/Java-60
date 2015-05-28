package Bodloguud;
import javax.swing.JOptionPane;

//3.A(N,M) массивийн мөрийн элементүүдийн нийлбэр их байхын мөрийн 
//элементүүдийг хэвлэ.

public class Bodlogo3{
	
	public static void main(String[] args){
		
		String ival;
		String jval;
		int row, column ;
		String output = null;
		int i, j;
		
		ival = JOptionPane.showInputDialog("muriin too");
		jval = JOptionPane.showInputDialog("baganiin too");
		
		row = Integer.parseInt(ival);
		column = Integer.parseInt(jval);		
		
		int a[][] = new int[row][column];
		System.out.println("lenght is "+a.length+" a["+row+"]["+column+"] array");
		
		int max=0;
		int maxIndex = 0;		
		int rowSum = 0;
		
		for (i=0; i<row; i++){
			rowSum = 0;
			for (j=0; j<column; j++){
				a[ i ][ j ] = ( int )( Math.random() * 10 );
				 output = ""+a[i][j];				 
				
				 System.out.print(output+" ");
				 rowSum += a[i][j];				 
				
			}
			System.out.print(" : "+rowSum);
			System.out.println("");
			if (i == 0) {
				max = rowSum;
			} else {
				if (max < rowSum) {
					max = rowSum;
					maxIndex = i;
				}
			}
		}
		System.out.println("\n****************************");
		for (int col = 0; col < a[maxIndex].length; col++) {
			System.out.print(a[maxIndex][col] + " ");
		}
		System.out.print(" : "+rowSum);
		System.out.println("");
	}
		
}
