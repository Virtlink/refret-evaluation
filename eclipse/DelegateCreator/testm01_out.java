test;
[p] {
[A]
    package p;
  
  public class A {
  
  	/**
  	 * @deprecated Use {@link #foo()} instead
  	 */
  	void foo() {
  		foo();
  	}
  
  	void foo() {
		
  	}
  }
  
}
