test;
[p] {
[B]
    package p;
  
  public class B {
  
  }
  
[A]
    package p;
  
  import java.util.ArrayList;
  
  public class A {
  
  	public static final A FOO= new A() {
  		ArrayList a;
  	};
  
  }
  
}
