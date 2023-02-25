test;
[test1] {
[B]
    package test1;
  import p.A;
  public class B {
  	public void foo() {
  		A a= A.RED;
  		A a2= A.RED.RED.PINK;
  	}
  }
  
}
[C]
    import static p.A.*;
  import p.A;
  public class C {
  	public boolean foo() {
  		return RED == A.GREEN.RED;
  	}
  }
  
[p] {
[A]
    package p;
  public enum A {
  	RED, GREEN, PINK // Color Different!
  }
  
}
