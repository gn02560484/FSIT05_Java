package tw.org.iii.mytest;

import javax.swing.JOptionPane;

public class test {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("year");
		int year = Integer.parseInt(s1);
		if (year % 4 == 0) {
			if (year % 100 ==0) {
				if(year % 400 ==0) {
					System.out.println("yes");//29
				}else {
					System.out.println("No");//28
				}
			}else {
				System.out.println("yes");//29
			}
		}else {
			System.out.println("No");//28
		}
	}

}
