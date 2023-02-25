test;
[p] {
[B]
    package p;
  class B{
  	public int f;
  }
[Test]
    package p;
  
  class Test{
  	void test(){
  		B a= new A();
  		test(a);
  	}
  	void test(B b){
  		b.f= 0;
  	}
  }
[A]
    package p;
  //use B
  class A  extends B{
  	public void foo(){};
  }
}
