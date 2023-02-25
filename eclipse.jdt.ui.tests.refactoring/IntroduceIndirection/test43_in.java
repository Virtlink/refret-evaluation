test;
[q] {
[Bar]
    package q;
  
  public class Bar {
  
  }
  
}
[p] {
[Foo]
    package p;
  
  public class Foo {
  
  	private void foo() { // <- create indirection in Bar.
  	}
  }
  
}
