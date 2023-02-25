test;
[p] {
[Bar]
    package p;
  
  public class Bar {
  	void bar() {
  	}
  }
  
[Foo]
    package p;
  
  public class Foo {
  	private Bar _bar;
  
  	private void foo() {
  		_bar.bar();
  	}
  }
  
}
