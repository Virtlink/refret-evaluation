test;
[p] {
[B]
    package p;
  interface B{
  }
[Test]
    package p;
  
  class Test{
  	void test(){
  		A a= new A();
  		test(a);
  	}
  	void test(A b){
  		int y= b.f;
  	}
  }
[A]
    package p;
  //use B
  class A implements B{
  	public static final int f = 0;
  	public void foo(){};
  }
}
