package tw.org.iii.mytest;

public class joe2 {

	public static void main(String[] args) {
		int a1 = 10, a2 = 3;
		int a3 = a1 / a2;
		System.out.println(a3);
		byte b1 = 10, b2 = 3;
		byte b3 = (byte)(b1 + b2); //byte & shot & int result will be int
		System.out.println(b3);
		byte b4 = 120 + 3;
		byte b5 = 127;
		b5++;
		System.out.println(b5);
		b5--;
		System.out.println(b5);
		b5 += 4;
		System.out.println(b5);
		b5 -= 4;
		System.out.println(b5);
		
	}

}
