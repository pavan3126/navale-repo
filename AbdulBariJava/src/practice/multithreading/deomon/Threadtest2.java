package practice.multithreading.deomon;
class MyThread2 extends Thread{
	public void run() {
		int count=1;
		while(true) {
			System.out.println(count++);
		}
	}
 }

public class Threadtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread2 t=new MyThread2();
t.setDaemon(true);
t.start();
try {Thread.sleep(10);
	}catch(Exception e) {
		
	}

}}
