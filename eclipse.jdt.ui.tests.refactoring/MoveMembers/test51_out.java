test;
[p] {
[B]
    package p;
  
  public class B {
  
  	static class Inner {
  		void foo() {};
  	}
  
  }
  
[A]
    package p;
  
  public class A {
  
  	{
  		new B.Inner().foo();
  	}
  
  }
  
}
