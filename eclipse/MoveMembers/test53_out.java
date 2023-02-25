test;
[p] {
[B]
    package p;
  
  public class B {
  
  	private static class InnerTarget {
		
  	}
  
  	// move to B
  	private static class C {}
  
  }
  
[A]
    package p;
  
  public class A {
  
  	// move to B
  	private static String a;
  	// move to B
  	private static void b() {}
  
  }
  
}
