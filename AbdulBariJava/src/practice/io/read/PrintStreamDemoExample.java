package practice.io.read;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Student{
	int rollno;
	String name;
	String dept;
}
public class PrintStreamDemoExample {

	public static void main(String[] args) throws Exception {
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Shree\\Desktop\\javafile.txt");
	PrintStream ps=new PrintStream(fos);
	 
	Student s=new Student();
	s.rollno=10;
	s.name="reema";
	s.dept="cse";
	ps.println(s.rollno);
	ps.println(s.name);
	ps.println(s.dept);
	ps.close();
	fos.close();
	}

}
