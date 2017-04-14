package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] intArray = new int[5];
		double sum = 0;
		System.out.println("5개의 정수를 입력하시오.");
		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
			sum = intArray[i] + sum;
		}
		/* 배열에 저장된 정수 값 더하기 */

		/* 출력 */
		System.out.println("평균 : " + sum / intArray.length);

		/* 자원정리 */
		scanner.close();
	}
}
