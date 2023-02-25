test;
[p] {
[Z]
    package p;
  public class Z extends A {
  	public final int a;
  	public final boolean b;
  
  	public Z(int a, int a_2, boolean b) {
  		super(a);
  		this.a = a_2;
  		this.b = b;
  	}
  
  	public int geta() {
  		return a;
  	}
  
  	public boolean getb() {
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
  	public B(int k, boolean l) {
  		super(4, k, l);
  	}
  }
  
}
