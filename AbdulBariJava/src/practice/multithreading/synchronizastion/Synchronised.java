package practice.multithreading.synchronizastion;


class Mydata{
	synchronized void display(String str) {//synchronized in multithreading
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThread extends Thread{
	Mydata d;
	public MyThread(Mydata d) {
		
		this.d = d;
	}
	
	public void run() {
		d.display("helloWorld");
	}
}
class MyThread2 extends Thread{
	Mydata data;

	public MyThread2(Mydata data) {
		
		this.data = data;
	}
	 public void run() {
         data.display("its time to perish");		
	}
	
}
public class Synchronised {

	public static void main(String[] args) {
	Mydata d=new Mydata();
	MyThread t1=new MyThread(d);
	MyThread2 t2=new MyThread2(d);
	t1.start();
	t2.start();
	
	}

}
