//package practice.multithreading.synchronizastion;
//
//class Atm {
//	public void checkBalance(String name) {
//		System.out.println(name + "checkingBalance");
//
//	}
//
//	public void withdraw(String name, int amount) {
//		System.out.println(name + "withdrawing" + amount);
//	}
//
//	class Customer extends Thread {
//		Atm a;
//		String name;
//		int amount;
//
//		public Customer(Atm atm, String name, int amount) {
//
//			this.a = atm;
//			this.name = name;
//			this.amount = amount;
//		}
//
//		public void useAtm() {
//			a.checkBalance(name);
//			a.withdraw(name, amount);
//		}
//
//		public void run() {
//			useAtm();
//		}
//	}
//
//	public class AtmMain {
//
//		public static void main(String[] args) {
//			Atm a= new Atm();
//
//			Customer c = new Customer(a, "siya", 10000);
//
//			Customer c2 = new Customer(a, "ram", 20000);
//			c.start();
//			c2.start();
//
//		}
//
//	}
//}
