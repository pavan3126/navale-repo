package practice.io.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Copy {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("source1.txt");
FileOutputStream fos=new FileOutputStream("source2.txt");
 int b;
 while((b=fis.read())!=-1) {
	 if(b>65&&b<90)
		 fos.write(b+32);
	 else fos.write(b);
 }
	}

}
