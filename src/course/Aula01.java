package course;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula01 implements Aula {

	public void main() {
		File file = new File("/home/ruan/Área de Trabalho/in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}
}
