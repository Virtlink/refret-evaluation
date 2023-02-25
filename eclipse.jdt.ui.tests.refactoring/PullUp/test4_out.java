test;
[p] {
[B]
    package p;
  
  class B extends A{
  }
[A]
    package p;
  
  import java.util.List;
  
  class A{	
  	void x(){}
  
  	protected void m(List l) {}
  }
}
