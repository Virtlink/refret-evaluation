test;
[p] {
[A]
    package p;
  //private, static, final
  class A{
  	A(){
  	}
  	void f(){
  		new A(){};
  	}
  }
}
