test;
[p] {
[Secondary]
    package p;
  
  class Secondary {
  	void f(A a){
  		a.a.a.new Inner();
  	}
  }
[A]
    package p;
  
  class A{
  	A a;
  	class Inner {
  	}
  }
}
