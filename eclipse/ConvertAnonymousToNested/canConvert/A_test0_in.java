test;
[p] {
[A]
    package p;
  //private, static, final
  class A{
  	void f(){
  		new A(){};
  	}
  }
}
