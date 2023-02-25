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
  		A a= new A();
  		test(a);
  	}
  	void test(A b){
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
