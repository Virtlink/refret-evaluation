test;
[p] {
[B]
    package p;
  interface B{
  	void foo();
  }
[Test]
    package p;
  
  class Test{
  	void test(){
  		B a= null;
  		test(a);
  	}
  	void test(B b){
  		b.foo();
  	}
  }
[A]
    package p;
  //use B
  abstract class A implements B{
  }
}
