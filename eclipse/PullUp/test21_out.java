test;
[p] {
[A]
    package p;
  
  class A {
  
  	void m() {
  		super.toString();
  	}
  }
  
  class C extends A {
  }
  
  class B extends C {
  }
}
