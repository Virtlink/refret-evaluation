test;
[p] {
[B]
    package p;
  public class B {
  }
  
  
[A]
    package p;
  public class A {
  	public void m(){}
  }
  
  
  
}
[q] {
[C]
    package q;
  
  import p.A;
  
  public class C {
  
  	public void n(A a) {
  		a.m();
  	}
  
  }
}
