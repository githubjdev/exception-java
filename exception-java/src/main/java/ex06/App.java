
package ex06;

public class App {
	public static void main(String[] args) {
		Conta c = new Conta(100);
		try {
			c.sacar(200);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}
}
