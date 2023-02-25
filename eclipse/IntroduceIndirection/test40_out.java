test;
[p] {
[Bar]
    package p;
  
  public class Bar {
  
  	/**
  	 * @param foo
  	 */
  	public static void foo(Foo foo) {
  		foo.foo();
  	}
  
  }
  
[Foo]
    package p;
  
  public class Foo {
  
  	protected void foo() { // <- create indirection in Bar.
  	}
  }
  
}
