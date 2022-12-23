package practice;
class Tv{
	public void switchOn() {
		System.out.println("tv is switched on in tv class");
	}
	public void changeChannel() {
		System.out.println("changing  the channel in tv class");
	}
}
class SmartTv extends Tv{
	@Override
	public void switchOn() {
		System.out.println("Smarttv is switched on");
	}
	@Override
	public void changeChannel() {
		System.out.println("SmartTv changing the channel");
	}
	public void browse() {
		System.out.println("browsing smart tv ");
	}
	
	
	
	
}
public class Ovrriding {

	public static void main(String[] args) {
		Tv t =new Tv();
		t.switchOn();
		t.changeChannel();
		SmartTv tv=new SmartTv()	;
		tv.browse();
		tv.changeChannel();
		tv.switchOn();
		//Tv t1=new SmartTv();
		     
	}

}
