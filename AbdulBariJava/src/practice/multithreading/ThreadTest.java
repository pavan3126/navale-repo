package practice.multithreading;

class Mythread extends Thread {
	public void run() {
		int i = 1;
		while (true) {
			System.out.println(i + "hello");
			i++;
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t = new Mythread();
		t.start();
		int i = 1;
		while (true) {
			System.out.println(i + "world");
			i++;
		}
	}

}
