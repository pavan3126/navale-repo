//package practice.multithreading;
//
//class Mydata {
//	int value;
//
//	synchronized public void set(int v) {
//		value = v;
//	}
//
//	synchronized public int get() {
//		int x = 0;
//		x = value;
//		return x;
//	}
//}
//
//class Producer extends Thread {
//	Mydata d;
//
//	public Producer(Mydata d) {
//
//		this.d = d;
//	}
//
//	public void run() {
//		int count = 1;
//		while (true) {
//			d.set(count);
//			System.out.println("producer" + count);
//			count++;
//		}
//	}
//
//	class Consumer extends Thread {
//		Mydata data;
//
//		public Consumer(Mydata d) {
//
//			data = d;
//		}
//
//		public void run() {
//			int value;
//
//			while (true) 
//			{
//				value = d.get();
//				System.out.println("consumer" + value);
//			}
//		}
//	}
//
//	public class InterThread {
//
//		public static void main(String[] args) {
//			Mydata m = new Mydata();
//			Producer p = new Producer(m);
//			Consumer c = new Consumer(m);
//p.start();
//c.start();
//		}
//
//	}
//}
