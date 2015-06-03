package Bodloguud;

import javax.swing.JOptionPane;

//100*100 хэмжээтэй дөрвөлжин шугамтай цаасан дээр бие биенээ огтлоогүй,шүргээгүй,давхцаагүй 
//тэгш өнцгүүд зурагдсан байна.A(100,100) массив өгөгдсөн бөгөөд энэ массивийн A(I,G)=1 бол 
//зурагдсан тэгш өнцөгтийн аль нэг нүдэнд байна.Эсрэг тохиолдолд A(I,G)=0 гэж үзнэ.
//Тэгш өнцөгтүүдн тоог тодорхойлох программ бич.

public class Bodlogo36 {
	public static void main(String[] args){
		
		int output = 0;
		int i, j;
		String tutoo = "";
		int tunum = 0;
		int ts1i = 0;
		int ts1j = 0;
		
		int in1i = 0;
		int in1j = 0;
		int in2i = 0;
		 int in2j = 0;
		 int in3i = 0;
		 int in3j= 0;			 
		 int in4i = 0;
		 int in4j = 0;
				
		int a[][] = new int[100][100];
		System.out.println("a[100][100] array \n");
		
		tutoo = JOptionPane.showInputDialog("heden tegsh untsugt uusgeh we");
		tunum = Integer.parseInt(tutoo);
		
		for(int k=1; k<=tunum; k++){
			 
			  in1i = Integer.parseInt(JOptionPane.showInputDialog( k +"-r tu-giin ehnii tsegiin index i:"));
			  in1j = Integer.parseInt(JOptionPane.showInputDialog(k+ "-r tu-giin ehnii tsegiin index j:"));
			 int urt  = Integer.parseInt(JOptionPane.showInputDialog("urtiin hemjee: "));
			 int urgun = Integer.parseInt(JOptionPane.showInputDialog("Urgunii hemjee: "));
			 
			  in2i = in1i;
			  in2j = in1j+ urt;
			  in3i = in1i+ urgun;
			  in3j= in1j;			 
			  in4i = in2i+ urgun;
			  in4j = in2j;
			 
			 System.out.println(" dot1: "+ in1i+" "+in1j);
			 System.out.println(" dot2: "+ in2i+" "+in2j);
			 System.out.println(" dot3: "+ in3i+" "+in3j);
			 System.out.println(" dot4: "+ in4i+" "+in4j);
			 
			 System.out.println(output);
			 for (i=0; i<100; i++){
					
					for (j=0; j<100; j++){					 
						 if(i<100 && j<100){
							 ts1i = i;
							 ts1j  = j;
							 
							 if(ts1i>=in1i && ts1j>=in1j){
								if(ts1i>=in2i && ts1j<=in2j){
									if(ts1i<=in3i && ts1j>=in3j){
										if(ts1i<=in4i && ts1j<=in4j){
											a[i][j]=1; 
										}								
									}							
								}
							 }							 
						 }
					}	
				}
		 }		
		
		for (i=0; i<100; i++){
			for (j=0; j<100; j++){				
				 System.out.print(a[i][j]+" ");					 
			}					
			System.out.println("");	
		}
		
		System.out.println("\n****************************************");		
		System.out.println("niit tegsh untsugtiin too: " + tunum);
		 
	}

}
