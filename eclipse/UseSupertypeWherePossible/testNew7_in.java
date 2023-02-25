test;
[p] {
[B]
    package p;
  class B{
  	public void fooB(){};
  }
[Test]
    package p;
  
  class Test{
  	void test(){
  		A a= new A();
  		test(a);
  	}
  	void test(A a){
  		a.fooB();
  	}
  }
[A]
    package p;
  //use B
  class A extends B{
  	public void foo(){};
  }
}
