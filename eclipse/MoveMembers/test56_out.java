test;
[p] {
[B]
    package p;
  
  public class B {
  
  	private static class InnerTarget {
		
  	}
  
  	// move to B
  	static class Inner {
  		String a;
  		void b() {}
  	}
  
  
  }
  
[A]
    package p;
  
  public class A {
  
  	{
  		new B.Inner().a= "";
  		new B.Inner().b();
  	}
  
  }
  
}
