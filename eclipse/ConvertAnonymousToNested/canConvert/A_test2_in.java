test;
[p] {
[A]
    package p;
  //public, nonstatic, final
  class A{
  	void f(){
  		new A(){};
  	}
  }
}
