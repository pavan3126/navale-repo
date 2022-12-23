package practice.io.read;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Copy2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis1=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\AbdulBariJava\\src\\practice\\iostreams\\source1.txt");
		FileInputStream fis2=new FileInputStream("C:\\Users\\Shree\\eclipse-workspace\\AbdulBariJava\\src\\practice\\iostreams\\source2.txt");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Shree\\eclipse-workspace\\AbdulBariJava\\src\\practice\\iostreams\\destination.txt");
	SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
	
	int b;
	while((b=sis.read())!=-1){
		fos.write(b);
		
	}
	sis.close();
	fis1.close();
	fis2.close();
	sis.close();
	
	}

}
