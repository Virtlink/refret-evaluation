test;
[p] {
[Bar]
    package p;
  
  public class Bar {
  
  }
  
[Foo]
    package p;
  
  public class Foo {
  
  	protected void foo() { // <- create indirection in Bar.
  	}
  }
  
}
