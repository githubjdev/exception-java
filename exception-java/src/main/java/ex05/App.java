
package ex05;

import java.io.*;

public class App {
	public static void main(String[] args) throws IOException {
		ler();
	}

	static void ler() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("x.txt"));
		br.readLine();
		br.close();
	}
}
