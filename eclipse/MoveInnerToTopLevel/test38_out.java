test;
[p] {
[B]
    package p;
  final class B {
  	private Class baz() {
  		return getClass();
  	}
  }
[A]
    package p;
  
  public class A {
  	private void bar() {
  		new B();
  	}
  }
}
