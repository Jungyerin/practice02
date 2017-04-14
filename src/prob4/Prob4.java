package prob4;

public class Prob4 {

	public static void main(String[] args) {

		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("java Programming");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */

		int length = str.length();
		char[] result = new char[length];
		int j = 0;

		for (int i = length - 1; i >= 0; i--) {
			result[j] = str.charAt(i);
			j++;
		}

		return result;
	}

	public static void printCharArray(char[] array) {
		/* 코드를 완성합니다 */
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

		System.out.println();
	}
}
