test;
[p] {
[A]
    package p;
  
  class A {
  }
  
  class B extends A {
  	protected void m() { 
  		new B();
  	}
  }
}
