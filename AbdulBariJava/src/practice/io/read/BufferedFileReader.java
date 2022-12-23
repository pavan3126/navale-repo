package practice.io.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedFileReader {

	public static void main(String[] args) throws Exception {
		FileReader fis =new FileReader("C:\\Users\\Shree\\Desktop\\javafile.txt");
		BufferedReader br=new BufferedReader(fis);
		
		
		int x;
		while((x=br.read())!=-1) {
			System.out.println((char)x);
		}
	}

}
