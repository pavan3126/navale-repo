package practice.io.read;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteOutStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ByteArrayOutputStream bos = new ByteArrayOutputStream(10);
		bos.write('a');
		bos.write('p');
		bos.write('a');
		bos.write('r');
		bos.write('n');
		bos.write('a'); 
		byte b[] = bos.toByteArray();
		for (byte x : b)
			System.out.println((char) x);
		bos.close();
	}

}
