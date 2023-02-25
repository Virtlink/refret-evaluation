test;
[p] {
[B]
    package p;
  
  class B extends A {
  	class P{};
  	void m() { 
  		P p= new P();
  	}	
  }
[A]
    package p;
  
  class A {
  }
  
}
