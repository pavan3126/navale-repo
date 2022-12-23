package practice.interfaces.third;

interface Member {
	void callBack();
}

class Customer implements Member {
	String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public void callBack() {
		System.out.println(name + " say's i will visit the store");
	}
}

class Store {
	Member mem[] = new Member[10];
	Customer are[]=new Customer[3];
	int count = 0;

	void register(Customer m) {
		are[count++] = m;
	}

	void inviteSale() {
		for (int i = 0; i < count; i++)
			are[i].callBack();
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Store s = new Store();
		Customer c1 = new Customer("james");
		Customer c2 = new Customer("gosling");
		s.register(c2);
		s.register(c1);
		s.inviteSale();
	}
}
