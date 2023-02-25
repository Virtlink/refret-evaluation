test;
[p] {
[A1]
    package p;
  
  public class A1 extends A{
  	protected void f(A a){
  		a.m1();
  	}
  }
[A]
    package p;
  
  public class A {
  	public void m() {}
  	public void m1() {}
  	protected void f(A a){
  	}
  }
}
