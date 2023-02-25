test;
[p] {
[Test]
    package p;
  class Test{
  	void test(){
  		A a= new A();
  		f(a);
  	}
  	void f(A a){
  		a.getClass();
  	}
  }
[A]
    package p;
  //use Object
  class A{
  	public void foo(){};
  }
}
