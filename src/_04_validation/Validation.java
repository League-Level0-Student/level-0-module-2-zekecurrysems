//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
for (int i = 0; i < 10; i++) {
	

		if(randomNumber == 0) { 
	JOptionPane.showMessageDialog(null, "your great");	}
if(randomNumber == 1) {
JOptionPane.showMessageDialog(null, "you smell good?");
}
if(randomNumber== 2) {		
JOptionPane.showMessageDialog(null, "your a boomer");
}
if(randomNumber == 3) {
JOptionPane.showMessageDialog(null, "your cool");
}
if(randomNumber == 4) {
JOptionPane.showMessageDialog(null, "you look nice?");
}if(randomNumber == 5) {
JOptionPane.showMessageDialog(null, "hey");
}

}









// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
