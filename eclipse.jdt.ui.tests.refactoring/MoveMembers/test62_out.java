test;
[p] {
[B]
    package p;
  
  public class B {
  
  	public static class SomeInner<T> {
  	}
  
  }
  
[A]
    package p;
  
  public class A {
  
  	public void foo() {
  		new B.SomeInner<String>();
  	}
  
  }
  
}
