test;
[p] {
[B]
    package p;
  
  import static p.A.m;
  
  public class B {
  
  	public void foo() {
  		m();
  	}
  }
[A]
    package p;
  
  public class A {
  
  	public static void m() {
  	}
  
  }
}
