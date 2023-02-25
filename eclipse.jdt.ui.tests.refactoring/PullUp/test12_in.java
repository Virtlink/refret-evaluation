test;
[p] {
[B]
    package p;
  import java.io.IOException;
  class B extends A{
  	private void m() throws IOException{
  	}
  }
  
[A]
    package p;
  class A{	
  	void x(){}
  }
}
