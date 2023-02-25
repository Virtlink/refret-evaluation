test;
[p] {
[Inner]
    package p;
  class Inner{
  	void f(){
  		f();
  	}
  }
[A]
    package p;
  class A {
  	static void f(){}
  }
}
