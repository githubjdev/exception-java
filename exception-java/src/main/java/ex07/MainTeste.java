package ex07;

public class MainTeste {
	public static void main(String[] args) {
		// Intercepta todas as exceções não tratadas
		Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());

		// Exemplo de erro
		throw new RuntimeException("Erro de teste");
	}
}
