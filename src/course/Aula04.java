package course;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula04 implements Aula {

	@Override
	public void main() {
		String[] lines = new String[] {"Goog morning", "Good afternoon", "Good night"};
		
		String path = "/home/ruan/Área de Trabalho/out.txt";
//		String path = "/home/out.txt";
		
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
