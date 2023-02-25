test;
[p] {
[Bar]
    package p;
  
  import java.io.IOException;
  
  public class Bar {
  
  	void foo() throws IOException {
		
  	}
  
  }
  
[Foo]
    package p;
  
  public class Foo extends Bar {
  
  	void foo() {
		
  	}
  
  	void myFoo() throws Exception {
  		foo();				// <-- invoke here
  		new Bar().foo();
  	}
  
  }
  
}
