package tw.org.iii.mytest;

import javax.swing.JOptionPane;

public class joe04 {

	public static void main(String[] args) {
		String a1 = JOptionPane.showInputDialog("input a number1"); // JOP=> show input window
		String a2 = JOptionPane.showInputDialog("input a number2");
		//System.out.println(a1);
		
		int i1 = Integer.parseInt(a1);
		int i2 = Integer.parseInt(a2);
		
		int s1 = i1 / i2;
		int s2 = i1 % i2;
		System.out.println(a1 + "/" + a2 + "=" + s1 +"....." + s2);
	}
}
