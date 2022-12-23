package practice.multithreading.runnable;

public class RunOneClass implements Runnable {
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+"vito");
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RunOneClass r=new RunOneClass();
Thread t=new Thread(r);
t.start();
int i=1;
while(true) {
	System.out.println(i+"carleone");
	i++;
}
	}

}
