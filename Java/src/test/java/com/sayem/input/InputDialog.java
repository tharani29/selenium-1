package com.sayem.input;

import javax.swing.JOptionPane;

public class InputDialog {
	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Masukkan nilai pertaman :") ;
		String sn = JOptionPane.showInputDialog("Masukkan nilai ke dua   : ");
		
		int firstNumber = Integer.parseInt(fn) ;
		int secondNumber = Integer.parseInt(sn);
		int sum = firstNumber + secondNumber;
		
		JOptionPane.showMessageDialog(null, "The summary Is " +sum);
	}
}
