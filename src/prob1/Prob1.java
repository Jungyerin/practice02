package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {

		final int[] money = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하시오");
		int number = scanner.nextInt();

		for (int i = 0; i < money.length; i++) {
			System.out.println(money[i] + " 원 권 : " + number / money[i]);
			number = number % money[i];
		}

		scanner.close();

	}
}