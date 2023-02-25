test;
[p] {
[Z]
    package p;
  public class Z extends A {
  	public Z() {
  		super();
  	}
  
  	void m() {}
  
  	void n() {}
  }
[A]
    package p;
  class A{
  }
  class B extends Z{
  }
  
}
