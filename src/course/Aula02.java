package course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula02 implements Aula{

	@Override
	public void main() {
		String path = "/home/ruan/Área de Trabalho/in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
		}
	}

}
