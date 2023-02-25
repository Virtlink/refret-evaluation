test;
[p] {
[Secondary]
    package p;
  
  class Secondary extends A{
  	void f(){
  		new Inner();
  	}
  }
[A]
    package p;
  
  class A{
  	class Inner{
  	}
  }
}
