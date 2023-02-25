test;
[p] {
[B]
    package p;
  class B {
  	public void firstMethodToMove(A a, String param) {
  		a.target.secondMethodToMove(a, param);
  	}
  
  	public void secondMethodToMove(A a, String param) {
  		a.methodToStay();
  	}
  }
[A]
    package p;
  class A {
  	B target = new B();
  	public void methodToStay() { };
  }
}
