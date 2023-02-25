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
  
  	private void hello() { // <- create indirection in p1.Bar
		
  	}
  }
  
}
