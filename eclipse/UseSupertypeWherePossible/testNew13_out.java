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
  		B a= new A();
  		test(a);
  	}
  	void test(B b){
  		b.foo();
  	}
  }
[A]
    package p;
  //use B
  class A implements B{
  	public void foo(){};
  }
}
