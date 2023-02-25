test;
[p] {
[B]
    package p;
  import static java.lang.Math.E;
  class B<S> extends A<S>{
  	protected void m(S s){double e= E;}
  }
[A]
    package p;
  class A<T>{	
  	void x(T t){}
  }
}
