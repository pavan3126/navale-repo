package practice.io.read;
import java.io.*;
class Producer extends Thread{
	OutputStream os;
	public Producer(OutputStream o) {
		os=o;
	}
	public void run() {
		int count =1;
		while(true) {
			try {
				os.write(count);
				os.flush();
				Thread.sleep(100);
				System.out.println("producer"+count);
				count++;
			} catch (Exception e) {
				
				}
			
		}
	}
}

class Consumer extends Thread{
	InputStream is;
	public Consumer (InputStream s) {
		is=s;
	}
	public void run() {
		int x;
		while(true) {
			try {
			x=is.read();
			System.out.println("in consumer"+x);
			System.out.flush();
			
			} catch (Exception e) {
				
				}
			
		}
	}
}
public class PipedDemo {

	public static void main(String[] args) throws Exception {
		    // TODO Auto-generated method stub
PipedInputStream pis=new PipedInputStream();
PipedOutputStream pos=new PipedOutputStream();
pis.connect(pos);
Producer p=new Producer(pos);
Consumer c=new Consumer(pis);
p.start();
c.start();
	}

}
