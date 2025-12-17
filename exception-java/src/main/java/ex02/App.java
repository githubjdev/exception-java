
package ex02;

public class App {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int resultado = a / b;
			System.out.println(resultado);
		} catch (ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
