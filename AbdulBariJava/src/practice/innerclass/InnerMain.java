package practice.innerclass;
 class Outers{
	 int x=10;
	 class Inner{
		 int y=20;
		 public void innerDisplay() {
			 System.out.println(x+" "+y);
		 }
	 }
	 public void outerDisplay() {
		 Inner i =new Inner(); 
		 i.innerDisplay();
	 }
 }
public class InnerMain {

	public static void main(String[] args) {
		Outers o=new Outers();
		o.outerDisplay();
	}

}
