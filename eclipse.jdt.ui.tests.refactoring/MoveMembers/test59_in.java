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
  
  	private static class SomeInner {
		
  		private static String a;
		
  		// move to B
  		// should increase visibility of a, b, Inner, SomeInner
  		private static class Inner {
			
  			private String b= a;
			
  		}
  	}
  
  	{
  		new SomeInner.Inner().b= "";
  	}
  
  }
  
}
