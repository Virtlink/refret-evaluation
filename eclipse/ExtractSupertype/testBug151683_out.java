test;
[p] {
[Z]
    package p;
  public class Z {
  	public Z() {
  		super();
  	}
  
  	protected void m() {}
  }
[A]
    package p;
  class A{
  }
  class B extends Z {
  	public void bar() {m();}
  }
  
}
