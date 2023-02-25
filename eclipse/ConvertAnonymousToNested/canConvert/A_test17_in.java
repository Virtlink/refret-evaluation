test;
[p] {
[A]
    package p;
  class A {
  	A(Object x){
  	}
  	void f(){
  		new A(this){
  		};
  	}
  }
}
