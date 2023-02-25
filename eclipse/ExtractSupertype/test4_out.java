test;
[p] {
[Z]
    package p;
  public abstract class Z extends A {
  	public Z(int i) {
  		super(i);
  	}
  
  	void m() {}
  }
[A]
    package p;
  abstract class A{
  	A(int i) {}
  }
  class B extends Z{
  	B(int i) { super(i); }
  }
  
}
