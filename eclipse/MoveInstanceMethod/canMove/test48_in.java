test;
[p] {
[B]
    package p;
  public class B {
  	public void n(q.C c, A a) {
  		a.m();
  	}
  }
  
  
[A]
    package p;
  public class A {
  	protected void m(){}
  }
  
  
  
}
[q] {
[C]
    package q;
  public class C {
  
  }
}
