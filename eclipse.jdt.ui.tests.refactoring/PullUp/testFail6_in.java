test;
[p] {
[B]
    package p;
  
  class B extends A {
  	void m() { 
  		a();
  	}
  	private void a(){}
  }
  
[A]
    package p;
  
  class A {
  }
  
}
