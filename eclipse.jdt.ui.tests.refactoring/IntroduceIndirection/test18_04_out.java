test;
[p] {
[C]
    package p;
  
  public class C {
  	void d() {
  
  	}
  }
[Foo]
    package p;
  
  public interface Foo {
  
  	/**
  	 * @param c
  	 */
  	static void d(C c) {
  		c.d();
  	}
  }
  
}
