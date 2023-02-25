test;
[p] {
[B]
    package p;
  class B {
  	public void firstMethodToMove(A a, String param) {
  		a.secondMethodToMove(param);
  	}
  }
[A]
    package p;
  class A {
  	B target = new B();
  	public void secondMethodToMove(String param) {
  		methodToStay();
  	}
  	public void methodToStay() { };
  }
}
