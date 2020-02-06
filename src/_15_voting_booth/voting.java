package _15_voting_booth;

import javax.swing.JOptionPane;

public class voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String V = JOptionPane.showInputDialog("how old are you");	
	
int num = Integer.parseInt(V);	

if (num >= 18) {
	JOptionPane.showInputDialog("who do you want the next president");	
} else {
JOptionPane.showMessageDialog(null, "no one cares what you think");
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
