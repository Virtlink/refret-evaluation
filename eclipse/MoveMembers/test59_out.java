test;
[p] {
[B]
    package p;
  
  import p.A.SomeInner;
  
  public class B {
  
  	private static class InnerTarget {
		
  	}
  
  	// move to B
  	// should increase visibility of a, b, Inner, SomeInner
  	static class Inner {
		
  		String b= SomeInner.a;
		
  	}
  
  
  }
  
[A]
    package p;
  
  
  public class A {
  
  	static class SomeInner {
		
  		static String a;
  	}
  
  	{
  		new B.Inner().b= "";
  	}
  
  }
  
}
