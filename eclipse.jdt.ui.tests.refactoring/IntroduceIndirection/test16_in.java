test;
[p] {
[Bar]
    package p;
  
  public class Bar {
  
  	{
  		new Foo().foo();
  	}
  
  }
  
[Foo]
    package p;
  
  public class Foo {
  
  	public void foo() {
		
  	}
  
  	{
  		foo();
  	}
  
  }
  
}
