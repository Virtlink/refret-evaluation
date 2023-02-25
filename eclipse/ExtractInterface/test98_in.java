test;
[p] {
[Bar]
    package p;
  public class Bar {
  
    private Foo foo;
  
    public Foo getFoo() {
  	return foo;
    }
  
    public void setFoo(Foo foo) {
  	this.foo = foo;
    }
  
    public void useFoo() {
  	foo.foo();
    }
  }
  
[Foo]
    package p;
  public class Foo {
  	public void foo() {
  
  	}
  }
  
}
