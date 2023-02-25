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
  		A a= null;
  		test(a);
  	}
  	void test(A b){
  		b.foo();
  	}
  }
[A]
    package p;
  //use B
  abstract class A implements B{
  }
}
