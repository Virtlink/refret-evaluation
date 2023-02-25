test;
[test1] {
[B]
    package test1;
  import static p.A.e;
  public class B {
  	public void foo() {
  		double pi= e;
  	}
  }
  
}
[C]
    import static p.A.*;
  public class C {
  	public boolean foo() {
  		return Math.PI == e;
  	}
  }
  
[p] {
[A]
    package p;
  public class A {
      public static final double e= Math.PI;
  }
  
}
