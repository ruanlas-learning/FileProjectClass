package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula03 implements Aula{

	@Override
	public void main() {
		String path = "/home/ruan/Área de Trabalho/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
//			String line = br.readLine();
//			
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
			String line = null;
			do {
				line = br.readLine();
				if (line != null) {
					System.out.println(line);
				}
			} while (line != null);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
