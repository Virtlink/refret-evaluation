test;
[p] {
[B]
    package p;
  
  class B extends A {
  	void m() { 
  		a(this);
  	}
  }
  
[A]
    package p;
  
  class A {
  	void a(A a){}
  	void a(B b){}
  }
  
}
