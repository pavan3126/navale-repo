package practice.io.read;

import java.io.File;

public class FileHandling {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
File f=new File("C:\\Users\\Shree\\Desktop");
System.out.println(f.isDirectory());
String list[]=f.list();
for(String x:list)
	System.out.println(x);

	}

}
