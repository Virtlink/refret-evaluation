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
  
  	static class Inner {
		
  		static class MoreInner {
			
  		}
		
  	}
  
  	void foo() {	// <- create an intermediary in Inner. 
		
  	}
  
  	{
  		foo();
  	}
  
  }
  
}
