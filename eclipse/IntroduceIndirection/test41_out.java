test;
[p] {
[Foo]
    package p;
  
  public class Foo {
  
  	private void foo() { // <- create indirection in Bar.
  	}
  
  	public static class Bar {
  
  		/**
  		 * @param foo
  		 */
  		public static void foo(Foo foo) {
  			foo.foo();
  		}
  	}
  }
  
}
