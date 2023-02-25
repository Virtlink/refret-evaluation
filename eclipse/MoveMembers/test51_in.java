test;
[p] {
[B]
    package p;
  
  public class B {
  
  }
  
[A]
    package p;
  
  public class A {
  
  	private static class Inner {
  		private void foo() {};
  	}
  
  	{
  		new Inner().foo();
  	}
  
  }
  
}
