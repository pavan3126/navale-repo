package practice;
class subject{
	private String studId;
	private String marks;
	private int maxMarks;
	private int marksObtain;
	
	public subject(String studId, String marks, int maxMarks, int marksObtain) {
		this.studId = studId;
		this.marks = marks;
		this.maxMarks = maxMarks;
		this.marksObtain = marksObtain;
	}

	public subject() {
		// TODO Auto-generated constructor stub
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public int getMaxMarks() {
		return maxMarks;
	}
 
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public int getMarksObtain() {
		return marksObtain;
	}

	public void setMarksObtain(int marksObtain) {
		this.marksObtain = marksObtain;
	}
boolean isQualified() {
	return marksObtain>=maxMarks/10*4;
}
	@Override
	public String toString() {
		return "subject [studId=" + studId + ", marks=" + marks + ", maxMarks=" + maxMarks + ", marksObtain="
				+ marksObtain + "]";
	}
	
}

public class SubjectMain {
public static void main(String[] args) {
	
	subject sub[]=new subject[3];
	sub[0]=new subject("s101","DS",100,73);
	sub[1]=new subject("s102","os",100,74);
	sub[2]=new subject("s103","java",100,74);
	for (subject s:sub)
		System.out.println(s);
	System.out.println(sub[0].isQualified());
	
}
}
 