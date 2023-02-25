test;
[p] {
[Z]
    package p;
  public class Z extends A {
  	public Z() {
  		super();
  	}
  
  	void m() {}
  }
[A]
    package p;
  class A{
  }
  class B extends Z{
  }
  
}
