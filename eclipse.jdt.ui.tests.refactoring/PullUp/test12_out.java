test;
[p] {
[B]
    package p;
  
  class B extends A{
  }
  
[A]
    package p;
  
  import java.io.IOException;
  
  class A{	
  	void x(){}
  
  	private void m() throws IOException {
  	}
  }
}
