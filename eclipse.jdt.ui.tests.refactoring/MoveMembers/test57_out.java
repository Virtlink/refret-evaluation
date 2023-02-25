test;
[p] {
[B]
    package p;
  
  public class B {
  
  	private static class InnerTarget {
		
  	}
  
  	// move to B
  	private static class Inner {
  		private String a;
  		private void b() {}
  	}
  
  
  }
  
[A]
    package p;
  
  public class A {
  
  }
  
}
