import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		System.out.println(Math.random());
		Random rd = new Random();
		System.out.println(rd.nextInt(10));
		System.out.println(rd.nextDouble());
	}

}
