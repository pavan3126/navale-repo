package practice.interfaces.pd;

import java.util.Arrays;

abstract class A{
	abstract void meth();
}


class C extends A {
	 public static int x=0;
	public C(int x) {
		this.x=x;
	}
	
	void meth() {
		System.out.println("meth of B");
	}
	
	
	}

class D{
	A[] arr =new A[10];
	int count=0;
	void add (C obj) {
		
		arr[count++]=obj;
	System.out.println();
	System.out.println(C.x);
	}
}
public class B{
	public static void main(String[] args) {
		
		D d=new D();
		C c=new C(100);
		D d1=new D();
		
		d.add(c);
		
	}

}


