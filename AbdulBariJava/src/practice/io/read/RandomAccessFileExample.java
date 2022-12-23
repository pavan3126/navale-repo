package practice.io.read;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
RandomAccessFile rf=new RandomAccessFile("C:\\Users\\Shree\\Desktop\\javafile.txt","rw");
	System.out.println((char)rf.read());
	System.out.println((char)rf.read());
	System.out.println((char)rf.read());
	
	rf.write('p');
	System.out.println(rf.getFilePointer());
	}

}
