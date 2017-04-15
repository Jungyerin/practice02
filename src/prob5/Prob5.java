package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		int k = r.nextInt(100) + 1;
		System.out.println("수를 결정하였습니다. 맞춰보세요" + "\n" + "1-100");

		while (true) {

			int number = scanner.nextInt();
			if (number < k) {
				System.out.println("더 높게" + "\n" + number + "-100");
			} else if (number > k) {
				System.out.println("더 낮게" + "\n" + "1-" + number);
			} else if (number == k) {
				System.out.println("맞았습니다." + "\n" + "다시하시겠습니까?(y/n)");
				String answer = scanner.next();
				if (answer.equals("n")) {
					break;
				} else if (answer.equals("y")) {
					r = new Random();
					k = r.nextInt(100) + 1;
					System.out.println("k=" + k);
					System.out.println("수를 결정하였습니다. 맞춰보세요" + "\n" + "1-100");
					continue;
				}
			}

		}
		scanner.close();

		System.out.println("종료되었습니다.");
	}
}