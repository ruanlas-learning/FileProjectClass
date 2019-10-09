package course;

import java.io.File;
import java.util.Scanner;

public class Aula06 implements Aula {

	@Override
	public void main() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String srtPath = sc.nextLine();
		
		File path = new File(srtPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}

}
