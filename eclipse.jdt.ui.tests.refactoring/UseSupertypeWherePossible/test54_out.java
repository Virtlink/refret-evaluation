test;
[p] {
[A1]
    package p;
  
  public class A1 extends A{
  	protected void f(I a){
  		a.m();
  	}
  }
[I]
    package p;
  /** typecomment template*/
  interface I {
  	void m();
  }
[A]
    package p;
  
  class A implements I {
  	public void m() {}
  	public void m1() {}
  	protected void f(I a){
  	}
  }
}
