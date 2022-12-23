package practice.multithreading;

public class Threads extends Thread {
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+"hello");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threads t=new Threads();
t.start();
int i=1;
while(true) {
	System.out.println(i+"world");
	i++;
}
	}

}
