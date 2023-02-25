test;
[p] {
[Inner]
    package p;
  class Inner{
  	void foo(){
  		A.f();
  	}
  }
[A]
    package p;
  class A {
  	static void f(){}
  }
}
