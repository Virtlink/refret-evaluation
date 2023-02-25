test;
[p] {
[Z]
    package p;
  public abstract class Z extends A {
  	public Z() {
  		super();
  	}
  
  	void m() {}
  
  	void n() {}
  }
[A]
    package p;
  abstract class A{
  }
  class B extends Z{
  }
  
}
