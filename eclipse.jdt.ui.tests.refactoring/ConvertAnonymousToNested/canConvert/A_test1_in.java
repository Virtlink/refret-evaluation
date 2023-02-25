test;
[p] {
[A]
    package p;
  //public, static, final
  class A{
  	void f(){
  		new A(){};
  	}
  }
}
