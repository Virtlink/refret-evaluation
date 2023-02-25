test;
[p0] {
[Bar]
    package p0;
  
  class Bar {
  
  }
  
[Foo]
    package p0;
  
  public class Foo {
  
  	// test visibility adjustment of intermediary type
  	// because of existing references
  
  	public void bar() { // <- create im in Bar.
		
  	}
  
  	{
  		bar(); 
  	}
  
  }
  
}
[p1] {
[Third]
    package p1;
  
  import p0.Foo;
  
  public class Third {
  
  	{
  		new Foo().bar();
  	}
  }
  
}
