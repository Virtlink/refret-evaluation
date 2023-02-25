test;
[test1] {
[B]
    package test1;
  import static p.A.PI;
  public class B {
  	public void foo() {
  		double pi= PI;
  	}
  }
  
}
[C]
    import static p.A.*;
  public class C {
  	public boolean foo() {
  		return Math.PI == PI;
  	}
  }
  
[p] {
[A]
    package p;
  public class A {
      public static final double PI= Math.PI;
  }
  
}
