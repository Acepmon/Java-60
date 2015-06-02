package Bodloguud;

import javax.swing.JOptionPane;

// A(N,M) массивийн баганын элементүүдийн нийлбэр их байх баганын 
// элементүүдийг хэвлэ

public class Bodlogo4 {
	
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
	int colSum = 0;
	
	for (i=0; i<row; i++){
		
		for (j=0; j<column; j++){
//			colSum = 0;
			a[ i ][ j ] = ( int )( Math.random() * 10 );
			 output = ""+a[i][j];				 
			
			 System.out.print(output+" ");
			 colSum += a[i][j];	
			 
			 if (j == 0) {
					max = colSum;
				} else {
					if (max < colSum) {
						max = colSum;
						maxIndex = j;
					}
				}			 
			 		
		}		
		
		System.out.println("");		
	}
		
	System.out.println("\n****************************");
	for (int col = 0; col < a[maxIndex].length; col++) {
		System.out.print(a[col][maxIndex] + " ");
	}
	System.out.println("");	
	}
}
