test;
[p] {
[B]
    package p;
  import java.util.List;
  class B extends A{
  	protected void m(List l){}
  }
[A]
    package p;
  class A{	
  	void x(){}
  }
}
