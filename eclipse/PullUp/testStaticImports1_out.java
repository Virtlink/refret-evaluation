test;
[p] {
[B]
    package p;
  
  class B<S> extends A<S>{
  }
[A]
    package p;
  
  import static java.lang.Math.cos;
  
  class A<T>{	
  	void x(T t){}
  
  	protected void m(T s) {double d= cos(0);}
  }
}
