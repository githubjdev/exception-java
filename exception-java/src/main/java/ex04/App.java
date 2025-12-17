
package ex04;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println(sc.nextInt());
		} finally {
			if (sc != null)
				sc.close();
		}
	}
}
