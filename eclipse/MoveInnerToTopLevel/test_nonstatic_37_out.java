test;
[p] {
[Inner]
    package p;
  class Inner {
  	/** Comment */
  	private A a;
  
  	/**
  	 * @param a
  	 */
  	Inner(A a) {
  		this.a= a;
  	}
  
  	public void doit() {
  		this.a.foo(this.a.bar());
  	}
  }
[A]
    package p;
  public class A {
  	public void foo(int value) {
  	}
  	public int bar() {
  		return 0;
  	}
  }
}
