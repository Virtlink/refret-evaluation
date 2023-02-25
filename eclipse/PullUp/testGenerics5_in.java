test;
[p] {
[B]
    package p;
  class B<S> extends A<S>{
  	protected void m(S s){}
  }
[A]
    package p;
  class A<T>{	
  	void x(T t){}
  }
}
