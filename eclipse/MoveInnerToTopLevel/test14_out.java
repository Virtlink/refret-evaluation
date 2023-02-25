test;
[p] {
[Inner]
    package p;
  class Inner{
  	static void foo() {
  	}
  	static int t= 1;
  }
[A]
    package p;
  class A {
  	static void f(){
  		Inner i;
  		Inner i2;
  		Inner.foo();
  		Inner.t =  2;
  		Inner.foo();
  		Inner.t =  2;
  		p.Inner.foo();
  		p.Inner.t =  2;
  	}
  }
}
