test;
[p] {
[B]
    package p;
  
  public class B {
  }
  
[Outer]
    package p;
  
  public class Outer {
  	public static class Inner<E> {
  	}
  }
  
[A]
    package p;
  
  import p.Outer.Inner;
  
  public class A {
  	public void foo(B b) {
  		Inner<String> i;
  	}
  }
  
}
