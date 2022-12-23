package practice.statics.studentchalleng;

import java.util.Date;

class Student{
	private String rollNo;
	private static int count=1;
	public Student() {
		rollNo=generateRollNo();
		
	}
	private String generateRollNo() {
		
		Date d=new Date();
		String rn="univ-"+(d.getYear()+1900)+"-"+count;
		count++;
		return rn;
	}
	public String getRollNo() {
		return rollNo;
	}
	
}
public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();
System.out.println(s1.getRollNo());
System.out.println(s2.getRollNo());
System.out.println(s3.getRollNo());

	}

}
