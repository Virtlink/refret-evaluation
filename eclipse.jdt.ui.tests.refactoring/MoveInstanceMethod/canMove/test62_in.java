test;
[q] {
[B]
    package q;
  
  public class B {
  	public class C {
  	}
  }
}
[p] {
[A]
    package p;
  
  import static java.util.Arrays.asList;
  import q.B;
  
  public class A {
  	public static class X {
  		void m(B.C c) {
  			n();
  			A.m();
  			asList("a","b");
  		}
  		public static void n() {}
  	}
  	public static void m() {}
  }
}
