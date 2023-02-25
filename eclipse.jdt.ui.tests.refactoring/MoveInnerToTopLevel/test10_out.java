test;
[p] {
[Inner]
    package p;
  class Inner{
  	void foo() {
  		A.F= 2;
  	}
  }
[A]
    package p;
  class A {
  	static int F= 1;
  }
}
