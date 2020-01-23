package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(9-1);
		int randomNumber2 = randomMaker.nextInt(9-1);
		int randomNumber3 = randomMaker.nextInt(9-1);
		int randomNumber4 = randomMaker.nextInt(9-1);
		int randomNumber5 = randomMaker.nextInt(9-1);
		
	
	
	JOptionPane.showMessageDialog(null, randomNumber+"  "+randomNumber2+" "+randomNumber3+" "+randomNumber4+" "+randomNumber5);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
