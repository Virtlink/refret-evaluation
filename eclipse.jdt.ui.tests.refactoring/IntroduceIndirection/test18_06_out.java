test;
[p] {
[C]
    package p;
  
  public class C {
  
  	/**
  	 * @param foo
  	 */
  	public static void d(Foo foo) {
  		foo.d();
  	}
  }
  
[Foo]
    package p;
  
  public interface Foo {
  
  	default void d() {
  
  	}
  
  }
  
}
