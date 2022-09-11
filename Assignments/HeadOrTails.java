package Assignments;

import java.util.Random;

public class HeadOrTails {
	public static void main(String args[]) {
		Random r = new Random();
		int RandomNumber = r.nextInt(2);
		if (RandomNumber == 1) {
			System.out.println("Getting High percentage in Tails ");
		} else {
			System.out.println("Getting High percenttage in Heads ");
		}
	}
}
