test;
[p] {
[Z]
    package p;
  public class Z extends A {
  	public final int a;
  	public final int b;
  
  	public Z(int a, int b) {
  		super();
  		this.a = a;
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
  }
  class B extends Z{
  	public B(int a, int b) {
  		super(a, b);
  	}
  }
  
}
