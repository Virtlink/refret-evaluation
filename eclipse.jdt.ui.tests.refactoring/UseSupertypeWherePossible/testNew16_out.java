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
  		B b= new A();
  		if (b instanceof A){
  		} else{
  		}
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
