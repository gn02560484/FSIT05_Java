package tw.org.iii.mytest;

public class joe03 {

	public static void main(String[] args) {
		float f1 = 1.2f; //1.2 =>double; 12=> int
		double s1 = 12.3;
		
		f1++;
		System.out.println(f1);
		f1 += 10;
		System.out.println(f1);
		
		long a1 = 10;
		float f2 = a1 + f1; //int + float => float
		
	}

}
