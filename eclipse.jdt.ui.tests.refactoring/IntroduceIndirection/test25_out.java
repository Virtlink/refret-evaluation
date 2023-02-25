test;
[p1] {
[Bar]
    package p1;
  
  import p0.Foo;
  
  class Bar {
  
  	/**
  	 * @param foo
  	 */
  	public static void bar(Foo foo) {
  		foo.foo();
  	}
  
  }
  
}
[p0] {
[Foo]
    package p0;
  
  public class Foo {
  
  	// Test adjustment of target method and target type 
  	// because of the intermediary
  
  	public void foo() { // <- create indirection in p1.Bar
		
  	}
  }
  
[SubFoo]
    package p0;
  
  class SubFoo extends Foo {
  
  	public void foo() { 
  
  	}
  
  }
  
}
