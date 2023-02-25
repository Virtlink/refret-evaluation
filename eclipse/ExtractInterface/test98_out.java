test;
[p] {
[Bar]
    package p;
  public class Bar {
  
    private IFoo foo;
  
    public IFoo getFoo() {
  	return foo;
    }
  
    public void setFoo(IFoo foo) {
  	this.foo = foo;
    }
  
    public void useFoo() {
  	foo.foo();
    }
  }
  
[Foo]
    package p;
  public class Foo implements IFoo {
  	public void foo() {
  
  	}
  }
  
[IFoo]
    package p;
  
  /** typecomment template*/
  public interface IFoo {
  
  	void foo();
  
  }
}
