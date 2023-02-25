test;
[p] {
[B]
    package p;
  
  import p.Outer.Inner;
  
  public class B {
  
  	public void foo() {
  		Inner<String> i;
  	}
  }
  
[Outer]
    package p;
  
  public class Outer {
  	public static class Inner<E> {
  	}
  }
  
[A]
    package p;
  
  public class A {
  }
  
}
