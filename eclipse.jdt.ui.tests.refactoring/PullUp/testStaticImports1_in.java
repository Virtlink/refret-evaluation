test;
[p] {
[B]
    package p;
  import static java.lang.Math.cos;
  class B<S> extends A<S>{
  	protected void m(S s){double d= cos(0);}
  }
[A]
    package p;
  class A<T>{	
  	void x(T t){}
  }
}
