test;
[p] {
[Z]
    package p;
  public class Z extends A {
  	public final int a;
  	public final int b;
  
  	public Z(int a, int a_2, int b) {
  		super(a);
  		this.a = a_2;
  		this.b = b;
  	}
  
  	public int geta() {
  		return a;
  	}
  
  	public int getb() {
  		return b;
  	}
  }
[A]
    package p;
  class A{
  	private int a;
  	public A(int a) {
  		this.a = a;
  	}
  }
  class B extends Z{
  	public B(int a, int b) {
  		super(4, a, b);
  	}
  }
  
}
