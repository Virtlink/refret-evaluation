test;
[p] {
[B]
    package p;
  class B<T> extends A<T>{
  }
[A]
    package p;
  import java.util.List;
  class A<T>{	
  	void x(){}
  
  	protected void m(List<T> l) {}
  }
}
