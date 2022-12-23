package practice.multithreading.runnable;

class outer implements Runnable{
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+"hello");
	i++;
		}
	}
}
public class Runable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
outer o=new outer();
Thread t=new Thread(o);
t.start();
int i=1;
while(true) {
	System.out.println(i+"world");
	i++;
}
	}

}
