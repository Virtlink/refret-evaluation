test;
[p] {
[A]
    package p;
  
  class SuperA{
  	void x(){}
  }
  class A extends SuperA{
  }
  class B extends A {
  	public void m() { 
  		super.x();
  	}
  }
}
