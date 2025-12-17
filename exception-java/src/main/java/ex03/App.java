
package ex03;

public class App {
	public static void main(String[] args) {
		String texto = "abc";
		try {
			int n = Integer.parseInt(texto);
			System.out.println(100 / n);
		} catch (NumberFormatException e) {
			System.out.println("Erro de conversão");
		} catch (ArithmeticException e) {
			System.out.println("Erro de divisão");
		}
	}
}
