test;
[p] {
[B]
    package p;
  class B{
  	public void foo(){};
  }
[Test]
    package p;
  
  class Test{
  	void test(){
  		B a= new A();
  		test(a);
  	}
  	void test(B a){
  		a.foo();
  	}
  }
[A]
    package p;
  //use B
  class A extends B{
  	public void foo(){};
  }
}
