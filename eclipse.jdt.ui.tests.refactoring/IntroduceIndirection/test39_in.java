test;
[p] {
[Bar]
    package p;
  
  public class Bar {
  
  }
  
[Foo]
    package p;
  
  public class Foo {
  
  	private void foo() { // <- create indirection in Bar.
  	}
  }
  
}
