test;
[p1] {
[Bar]
    package p1;
  
  class Bar {
  
  }
  
}
[p0] {
[Foo]
    package p0;
  
  class Foo {
  
  	// Test adjustment of target method and target type 
  	// because of the intermediary
  
  	protected void foo() { // <- create indirection in p1.Bar
		
  	}
  }
  
[SubFoo]
    package p0;
  
  class SubFoo extends Foo {
  
  	protected void foo() { 
  
  	}
  
  }
  
}
