test;
[q] {
[B]
    package q;
  
  import static java.util.Arrays.asList;
  
  import p.A;
  
  public class B {
  	public class C {
  
  		public void m() {
  			A.X.n();
  			A.m();
  			asList("a","b");
  		}
  	}
  }
}
[p] {
[A]
    package p;
  
  public class A {
  	public static class X {
  		public static void n() {}
  	}
  	public static void m() {}
  }
}
