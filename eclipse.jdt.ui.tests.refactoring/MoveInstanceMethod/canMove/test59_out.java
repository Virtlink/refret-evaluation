test;
[p] {
[B]
    package p;
  
  import static java.util.Arrays.asList;
  
  public class B {
  
  	void m() {
  		asList(toString());
  		A.n();
  	}	
  }
[A]
    package p;
  
  public class A {	
  	class X {
  	}
  
  	public static void n() {
  	}
  }
}
