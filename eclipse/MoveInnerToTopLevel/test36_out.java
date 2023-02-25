test;
[p] {
[Inner]
    package p;
  // move to top
  class Inner {
  
  	String b= A.SomeInner.a;
  
  }
[A]
    package p;
  
  
  public class A {
  
  	static class SomeInner {
		
  		static String a;
  	}
  
  	{
  		new Inner().b= "";
  	}
  
  }
  
}
