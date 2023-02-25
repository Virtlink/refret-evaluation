test;
[p] {
[Test]
    package p;
  class Test{
  	void test(){
  		Object a= new A();
  		f(a);
  	}
  	void f(Object a){
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
