test;
[p] {
[B]
    package p;
  class B<S> extends A<S>{
  }
[A]
    package p;
  class A<T>{	
  	void x(T t){}
  
  	protected void m(T s) {}
  }
}
