test;
[p] {
[A]
    package p;
  //public, static, final
  class A<T>{
  	void f(){
  		new A<T>(){};
  	}
  }
  
}
