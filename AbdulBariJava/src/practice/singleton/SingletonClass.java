package practice.singleton;
class CoffeeMachine{
	private float cofQty;
	private float milkQty;
	static private CoffeeMachine my=null;
	
	private CoffeeMachine() {
		cofQty=1;
		milkQty=1;
		// TODO Auto-generated constructor stub
	}
	static public CoffeeMachine getInstance() {
		 if(my==null)
			 my=new CoffeeMachine();
		return my;
		
	}
	
	
	
}

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
