test;
[p0] {
[Bar]
    package p0;
  
  public class Bar {
  
  	/**
  	 * @param foo
  	 */
  	public static void bar(Foo foo) {
  		foo.bar();
  	}
  
  }
  
[Foo]
    package p0;
  
  public class Foo {
  
  	// test visibility adjustment of intermediary type
  	// because of existing references
  
  	public void bar() { // <- create im in Bar.
		
  	}
  
  	{
  		Bar.bar(this); 
  	}
  
  }
  
}
[p1] {
[Third]
    package p1;
  
  import p0.Bar;
  import p0.Foo;
  
  public class Third {
  
  	{
  		Bar.bar(new Foo());
  	}
  }
  
}
