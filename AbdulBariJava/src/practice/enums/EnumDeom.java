package practice.enums;

enum Dept {
	CS("john","Block B");// IT, ETC, CIVIL, MECH;
String head;
String loc;
	private Dept(String head,String loc) {
		this.head=head;
		this.loc=loc;

	}
public String getHeadNAme() {
	return head;
}
public String getLocation() {
	return loc;
}
//	public void Display() {
//		System.out.println(this.name() + "  " + this.ordinal());
//	}
}
public class EnumDeom {

	public static void main(String[] args) {

		Dept d = Dept.CS;
		System.out.println(d.getHeadNAme());
		System.out.println(d.getLocation());
//System.out.println(Dept.valueOf("CIVIL"));
//Dept list[]=Dept.values();
//for(Dept x:list)
//	System.out.println(x);
//		switch (d) {
//		case CS:
//			System.out.println("cs");
//			break;
//		case IT:
//			System.out.println("it");
//			break;
//		case ETC:
//			System.out.println("etc");
//			break;
//		case CIVIL:
//			System.out.println("civil");
//			break;
//		case MECH:
//			System.out.println("mech");
//			break;
//
//		}
	}

}
	