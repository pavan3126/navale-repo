package practice.multithreading;
class Mythreadd extends Thread{
	
	 public Mythreadd(String name) 
	 {
		 super(name);
		 setPriority(Thread.MAX_PRIORITY);
		 
	 }
	 public void run() {
		 int count=1;
		 while(true) {
			 System.out.println(count++);
			 try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
		 }
	 }
}
public class ThreadTest2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Mythreadd t=new Mythreadd("name");


System.out.println(t.getId());
System.out.println(t.getName());
System.out.println(t.getPriority());
System.out.println(t.isAlive());
t.start();
t.interrupt();
System.out.println(t.getState());
	}

}
