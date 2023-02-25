test;
[p] {
[A1]
    package p;
  
  public class A1 extends A{
  	protected void f(A a){
  		a.m1();
  	}
  }
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  	void m();
  
  }
[A]
    package p;
  
  public class A implements I {
  	public void m() {}
  	public void m1() {}
  	protected void f(A a){
  	}
  }
}
