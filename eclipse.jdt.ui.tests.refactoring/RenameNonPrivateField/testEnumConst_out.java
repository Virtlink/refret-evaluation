test;
[test1] {
[B]
    package test1;
  import p.A;
  public class B {
  	public void foo() {
  		A a= A.REDDISH;
  		A a2= A.REDDISH.REDDISH.PINK;
  	}
  }
  
}
[C]
    import static p.A.*;
  import p.A;
  public class C {
  	public boolean foo() {
  		return REDDISH == A.GREEN.REDDISH;
  	}
  }
  
[p] {
[A]
    package p;
  public enum A {
  	REDDISH, GREEN, PINK // Color Different!
  }
  
}
