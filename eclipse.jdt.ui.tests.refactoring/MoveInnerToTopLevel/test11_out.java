test;
[p] {
[Inner]
    package p;
  class Inner{
  	void foo() {
  		A.F= 1;
  		A.F= 2;
  		p.A.F= 3;
  	}
  }
[A]
    package p;
  class A {
  	static int F= 1;
  }
}
