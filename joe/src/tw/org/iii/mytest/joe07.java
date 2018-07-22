package tw.org.iii.mytest;

public class joe07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rand = Math.random(); // 0.0 <= random < 1.0
		int score = (int)(Math.random() * 101); //共有101種成績, 如果是骰子1~6,就是6種
		System.out.println(score);
		
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80){
			System.out.println("B");
		}else if (score >= 70){
			System.out.println("C");
		}else if (score >= 60){
			System.out.println("D");
		}else {
			System.out.println("E");
		}
	}

}
