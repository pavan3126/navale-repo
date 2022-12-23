package practice.iostreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos =new FileOutputStream("C:/DAC/myJava.txt");
		
		String str="i luv java";
		byte b[]=str.getBytes();
		for(byte x:b)
			fos.write(x);
		//fos.write(str.getBytes());
		fos.close();
		
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
