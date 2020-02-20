package _99_extra;

import javax.swing.JOptionPane;

public class Relational_Checkpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



String  A	=JOptionPane.showInputDialog("how many cups of flour you have");
int num = Integer.parseInt(A); 
if(num <2 ) {	
JOptionPane.showMessageDialog(null, "you need to go buy more flour");
}
String  B	=JOptionPane.showInputDialog("how many people they are going to give cookies to");
int Num = Integer.parseInt(B); 
if(Num > 30) {	
JOptionPane.showMessageDialog(null, " you are going to have to bake two\r\n" + 
		"batches of cookies");
}
String  C =JOptionPane.showInputDialog("how many batches of cookies they baked");
int NUm = Integer.parseInt(C);	
if(NUm >= 2) {	
JOptionPane.showMessageDialog(null, "you are lucky to have so many friends");	
}	
	
	
	
	
	
	

 	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
