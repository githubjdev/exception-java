
package ex06;

public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double v) throws SaldoInsuficienteException {
		if (v > saldo)
			throw new SaldoInsuficienteException("Saldo insuficiente");
		saldo -= v;
	}
}
