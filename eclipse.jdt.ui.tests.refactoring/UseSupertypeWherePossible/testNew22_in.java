test;
[p] {
[B]
    package p;
  class B{}
  
[Test]
    package p;
  
  class Test{
  	A a;
  	void f(){
  		f(a);
  	}
  	void f(B b){
  	}
  }
[A]
    package p;
  //change to B
  class A extends B{
  }
}
