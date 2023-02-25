test;
[p] {
[Z]
    package p;
  import java.util.Stack;
  public class Z<T extends Integer> extends Stack<T> {
  	public Z() {
  		super();
  	}
  
  	void foo(T t) {
  	}
  }
[A]
    package p;
  
  public class A {
  }
  
  public class B<T extends Integer> extends Z<T> {
  }
  
}
