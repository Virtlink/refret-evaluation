test;
[p] {
[B]
    package p;
  
  public class B {
  
  	private static class InnerTarget {
		
  	}
  
  
  }
  
[A]
    package p;
  
  public class A {
  
  	// move to B
  	private static class Inner {
  		private String a;
  		private void b() {}
  	}
  
  	{
  		new Inner().a= "";
  		new Inner().b();
  	}
  
  }
  
}
