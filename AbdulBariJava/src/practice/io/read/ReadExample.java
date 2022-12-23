package practice.io.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;

public class ReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fis =new FileInputStream("C:/DAC/myJava.txt");
	byte b[]=new byte[fis.available()];
			
			fis.read(b);
			String str=new String(b);
			System.out.println(str);
		
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
