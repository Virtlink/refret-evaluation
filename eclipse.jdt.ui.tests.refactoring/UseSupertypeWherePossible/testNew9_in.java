test;
[p] {
[Test]
    package p;
  
  class Test{
  	void test(){
  		A a= new A();
  		test(a);
  	}
  	void test(Object o){
  		o.hashCode();
  	}
  }
[A]
    package p;
  //use Object
  class A {
  	public void foo(){};
  }
}
