package general;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Fpath = "D:\\mad grp project\\sample.txt";
		
		BufferedReader bf = new BufferedReader(new FileReader(Fpath));
		
		String startLine;
		
		while((startLine = bf.readLine()) != null) {
			System.out.println(startLine);
		}

	}

}
