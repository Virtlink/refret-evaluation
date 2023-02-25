test;
[q] {
[Bar]
    package q;
  
  import p.Foo;
  
  public class Bar {
  
  	/**
  	 * @param foo
  	 */
  	public static void foo(Foo foo) {
  		foo.foo();
  	}
  
  }
  
}
[p] {
[Foo]
    package p;
  
  public class Foo {
  
  	public void foo() { // <- create indirection in Bar.
  	}
  }
  
}
