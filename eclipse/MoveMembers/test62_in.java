test;
[p] {
[B]
    package p;
  
  public class B {
  
  }
  
[A]
    package p;
  
  public class A {
  
  	public static class SomeInner<T> {
  	}
  
  	public void foo() {
  		new SomeInner<String>();
  	}
  
  }
  
}
