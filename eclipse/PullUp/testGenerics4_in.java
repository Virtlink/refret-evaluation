test;
[p] {
[B]
    package p;
  import java.util.List;
  class B<T> extends A<T>{
  	protected void m(List<T> l){}
  }
[A]
    package p;
  class A<T>{	
  	void x(){}
  }
}
