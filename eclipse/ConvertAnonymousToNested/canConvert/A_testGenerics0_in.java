test;
[p] {
[A]
    package p;
  //private, static, final
  class A<T>{
  	void f(){
  		new A<T>(){};
  	}
  }
  
}
