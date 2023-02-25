test;
[p] {
[Bar]
    package p;
  
  public class Bar {
  
  	public void getDisplay() {}
  
  }
  
[Foo]
    package p;
  
  public class Foo extends Bar {
  
  	// Test correct "thisification".
  
  	void foo() {
		
  		X x= new X() {
			
  			{
  				getDisplay(); // <- invoke here
  			}
  		};
  	}
  }
  
  class X {
  
  }
  
}
